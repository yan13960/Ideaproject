layui.use(['table', 'form', 'upload', 'jquery', 'layer', 'layedit', 'upload'], function () {
    var table = layui.table,
        form = layui.form,
        $ = layui.jquery,
        layedit = layui.layedit,
        upload = layui.upload,
        layer = layui.layer;

    // 规格数据和货品数据
    var specData=[];
    var goodsData=[];
    var attrData=[];
    /**
     * 初始化
     */
    // 初始化表单渲染
    form.render();
    // 初始化商品分类下拉数据
    init();
    // 加载layedit编辑器
    layedit.set({
        uploadImage: {
            url: '/product/uploadForLayEdit'
        }
    });
    var editIndex = layedit.build('productDetail');

    // 初始化默认规格和商品货品数据和商品参数信息
    initSpecAndProductTable();

    /**
     * 提交上传表单
     */
    form.on('submit(addFormSubmitBtn)',function(data) {
        if(getGalleryImg("picPreview").length === 0){
            layer.msg("请上传商品首页图!",{icon:5});
            return false;
        }
        if(getGalleryImg("galleryPreview").length === 0){
            layer.msg("最少上传一张商品宣传图!",{icon:5});
            return false;
        }
        data.field.specs = JSON.stringify(layui.table.cache.spec_table);
        let goods = layui.table.cache.goods_table
        for (let i = 0; i < goods.length; i++) {
            goods[i].specifications = JSON.stringify(goods[i].specifications);
        }
        data.field.goods = JSON.stringify(goods);
        data.field.attributes = JSON.stringify(layui.table.cache.attribute_table);
        data.field.price = Math.min.apply(Math, layui.table.cache.goods_table.map(item => {return item.price}));
        data.field.detail = layedit.getContent(editIndex);
        data.field.pic = JSON.stringify(getGalleryImg("picPreview"));
        data.field.gallery = JSON.stringify(getGalleryImg("galleryPreview"));
        $.post('/product/add', data.field, function (suc) {
            console.log(suc);
        })
        parent.layer.close(parent.layer.getFrameIndex(window.name));
        return false;
    })

    /**
     * 图片上传
     */
    //商品首页展示图片上传
    upload.render({
        elem: '#picPreviewBtn',
        url: '/product/upload',
        accept: 'image',
        acceptMime: 'image/jpg, image/png, image/jpeg',
        auto: true,
        size: 10000,
        before: function(obj){
            layer.load();
        },
        done:function(res){
            $('#picPreviewBtn').hide();
            layer.closeAll('loading');
            generateUploadImgView(0,res.filePath,"picPreview",1);
        },
        error: function(index, upload){
            layer.closeAll('loading');
        }
    });

    // 商品宣传图上传,
    var galleryIndex = 0;
    upload.render({
        elem: '#galleryPreviewBtn',
        url: '/product/upload',
        accept: 'image',
        acceptMime: 'image/jpg, image/png, image/jpeg',
        auto: true,
        size: 10000,
        before: function(obj){
            layer.load();
        },
        done:function(res){
            layer.closeAll('loading');
            generateUploadImgView(galleryIndex,res.filePath,"galleryPreview",5);
            galleryIndex = galleryIndex+1;
            if(getGalleryImg("galleryPreview").length === 5){
                $('#galleryPreviewBtn').hide();
            }
        },
        error: function(index, upload){
            layer.closeAll('loading');
        }
    });

    //商品规格图片上传
    upload.render({
        elem: '#specPreviewBtn',
        url: '/product/upload',
        accept: 'image',
        acceptMime: 'image/jpg, image/png, image/jpeg',
        auto: true,
        size: 10000,
        before: function(obj){
            layer.load();
        },
        done:function(res){
            $('#specPreviewBtn').hide();
            layer.closeAll('loading');
            generateUploadImgView(0,res.filePath,"specPreview",1);
        },
        error: function(index, upload){
            layer.closeAll('loading');
        }
    });

    /**
     * 获取元素下所有图片
     * @param _id div的preview名称
     */
    function getGalleryImg(_id) {
        let imgList = [];
        var k = "upload-img-view_" + _id;
        $("." + k + " img").each(function() {
            var src=$(this).attr("src");
            imgList.push(src);
        });
        return imgList;
    }
    /**
     * 图片上传通用图片视图生成
     * @param _id 唯一标识
     * @param _imgFilePath 图片路径
     * @param _view 要追加到的dom
     * @param _num 限制图片数量
     */
    function generateUploadImgView(_id,_imgFilePath,_view,_num){
        let contentId = _view+"_content_"+_id;
        let maskId = _view+"_mask_"+_id;
        let removeId = _view+"_removeId_"+_id;
        // html
        let imageView = '<div id="'+contentId+'" class="upload-img-view upload-img-view_'+_view+'">';
        imageView += '<img src="'+_imgFilePath+'" class="upload-img-view_'+_view+'" />';
        imageView += '<div id="'+maskId+'" class="upload-img-view-mask"><i id="'+removeId+'" class="layui-icon">&#xe640;</i></div>';
        imageView += '</div>';
        // 给_view追加生成的图片div
        $('#' + _view).append(imageView);
        // 绑定删除事件和图片遮罩层
        $('#' + removeId).bind('click', function () {
            $('#' + contentId).remove();
            if(getGalleryImg("upload-img-view_"+_view).length<_num){
                $('#' + _view + 'Btn').show();
            }
        });
        $('#' + contentId).bind('mouseover', function () {
            $('#' + maskId).show();
        });
        $('#' + contentId).bind('mouseout', function () {
            $('#' + maskId).hide();
        });
    }

    /**
     * 货品相关
     */
    // 货品表格工具事件监听
    var goodsIndex;
    var goodsFormObj;
    table.on('tool(goods_table)',function(obj) {
        let event = obj.event;
        let data = obj.data;
        if(event === 'set'){
            goodsFormObj = obj;
            goodsIndex = layer.open({
                type:1,
                title:'商品货品设置',
                area : ['600px', '355px'],
                shadeClose:true,
                content: $("#goodsMessage")
            });
        }
    })
    // 提交货品表单
    form.on('submit(goodsSubmit)',function(data) {
        layer.close(goodsIndex);
        goodsFormObj.update({
            'price': data.field.goodsPrice,
            'number': data.field.goodsNum,
        });
        goodsData = layui.table.cache.goods_table;
        return false;
    })

    /**
     * 规格相关
     */
    // 添加规格
    var specIndex;
    $("#spec_sup_add").click(function(){
        specIndex = layer.open({
            type:1,
            title:'添加规格',
            area : ['750px', '465px'],
            shadeClose:true,
            content: $("#specMessage")
        });
    });
    // 提交规格表单
    var spec_id = 0;
    form.on('submit(specSubmit)',function(data) {
        layer.close(specIndex);
        let field = data.field;
        let galleryImg = getGalleryImg("specPreview");
        if(galleryImg.length === 0){
            data.field.specUrl = '';
        }else{
            data.field.specUrl = galleryImg[0];
        }
        specData.push({
            "id": spec_id,
            "name": field.specName,
            "value": field.specValue,
            "url": field.specUrl,
        })
        spec_id = spec_id+1;
        arraySort(specData,"name",true);
        localDataTableReload("spec_table",specData);
        goodsData = [];
        goodsGenerateData();
        localDataTableReload("goods_table",goodsData);
        return false;
    })
    // 规格表格工具事件监听
    table.on('tool(spec_table)',function(obj) {
        let event = obj.event;
        let data = obj.data;
        let spec_sup_status = $("input[name='spec_sup']:checked").val();
        if(event === 'del'){
            if(spec_sup_status === '0'){
                layer.msg("默认规格不可删除!",{icon:5});
            }else{
                obj.del();
                specData = specData.filter(item => item.id !== data.id);
                localDataTableReload("spec_table",specData);
                goodsData = [];
                goodsGenerateData();
                localDataTableReload("goods_table",goodsData);
            }
        }
    })
    // 单多规格radio切换监听
    var beforeSpecSupStatus = "";
    form.on('radio(spec_sup)', function(data){
        specData = [];
        goodsData = [];
        let value = data.value;
        if(value === beforeSpecSupStatus){ //重复点击已选择radio
            return false;
        }
        if(value === '0'){
            $("#spec_sup_add").hide();
            specData.push({
                "id" : 0,
                "name" : "规格",
                "value" : "标准",
                "url" : "",
            })
            goodsData.push({
                "id" : 0,
                "specifications": ["标准"],
                "price": "0.00",
                "number": "0",
            })
            localDataTableReload("spec_table",specData);
            localDataTableReload("goods_table",goodsData);
        }else{
            $("#spec_sup_add").show();
            arraySort(specData,"name",true);
            localDataTableReload("spec_table",specData);
            goodsGenerateData();
            localDataTableReload("goods_table",goodsData);
        }
        beforeSpecSupStatus = value;
    });
    /**
     * 本地数据表格通用刷新方法(不分页)
     * @param _id 原始容器,对应lay-filter
     * @param _data 本地数据
     */
    function localDataTableReload(_id,_data) {
        table.reload(_id,{
            data: _data,
            limit: _data.length,
        });
    }
    //根据规格选择生成货品表格数据
    function goodsGenerateData() {
        let specData = layui.table.cache.spec_table;
        if(specData.length === 0){
            return false;
        }
        let obj = [];
        specData.forEach((item, index) => {
            let { name } = item;
            let { value } = item;
            if (!obj[name]) {
                obj[name] = [];
            }
            obj[name].push(value);
        });
        let data = Object.values(obj);
        let resultLength = 1;
        for (let i = 0;i<data.length; i++){
            resultLength = resultLength*data[i].length;
        }
        let resultData = arrayCombination(data);
        for(let i=0;i<resultData.length;i++){
            goodsData.push({
                "id" : i,
                "specifications": resultData[i],
                "price": "0.00",
                "number": "0",
            })
        }
    }

    /**
     * 商品参数相关
     */
    var attributeIndex;
    // 添加商品参数
    $("#attr_add").click(function(){
        attributeIndex = layer.open({
            type:1,
            title:'添加商品参数信息',
            area : ['600px', '350px'],
            shadeClose:true,
            content: $("#attributeMessage")
        });
    });
    // 提交商品参数信息
    var attr_id = 0;
    form.on('submit(attributeSubmit)', function(data) {
        layer.close(attributeIndex);
        let field = data.field;
        attrData.push({
            "id": attr_id,
            "name": field.attributeName,
            "value": field.attributeValue,
        });
        attr_id = attr_id+1;
        arraySort(attrData,"name",true);
        localDataTableReload("attribute_table",attrData);
        return false;
    })
    // 商品参数表格工具事件监听
    table.on('tool(attribute_table)',function(obj) {
        let event = obj.event;
        let data = obj.data;
        if(event === 'del'){
            obj.del();
            attrData = attrData.filter(item => item.id !== data.id);
            localDataTableReload("attribute_table",attrData);
        }
    })

    /**
     * tips
     */
        // 市场价的tips
    var counter_price_tips_index;
    $("#counter_price_tips").hover(function(){
        let msg = "即为折扣前价格,不填写时页面默认不显示,如果填写必须高于所有商品规格价格中的最低价格"
        var html = '<div class="custom-tips-title">温 馨 提 示</div>\n' +
            '<div class="custom-tips-content">'+msg+'</div>'
        counter_price_tips_index = layer.tips(html, '#counter_price_tips', {
            tips: [1, ' #FFFFFF'],
            time: 10000,
            skin: 'custom' //自定义class名称
        });
    },function () {
        layer.close(counter_price_tips_index);
    });


    // 初始化规格和货品表格
    function initSpecAndProductTable() {
        // 默认初始化单一规格数据
        specData.push({
            "id":0,
            "name":"规格",
            "value":"标准",
            "url":"",
        })
        goodsData.push({
            "id": 0,
            "specifications": ["标准"],
            "price": "0.00",
            "number": "0",
        })
        //默认规格表格数据
        table.render({
            elem: '#spec_table',
            data: specData,
            skin: 'line',
            autoSort:false,
            page: false,
            cols: [[
                {field: 'name', title: '规格名', align: 'center'},
                {field: 'value', title: '规格值', align: 'center', templet:function (data) {
                        return '<span class="spec-span">'+data.value+'</span>'
                    }},
                {field: 'url', title: '规格图片', align: 'center', templet: function (data) {
                        var url = data.url;
                        return "<div><img src='" + url + "' style='height:40px;width=40px'></div>";
                    }},
                {title: '操作',toolbar: '#specBar', align: 'center'},
            ]]
        });
        //默认货品表格数据
        table.render({
            elem: '#goods_table',
            data: goodsData,
            skin: 'line',
            autoSort:false,
            page: false,
            cols: [[
                {field: 'specifications', title: '货品规格', align: 'center',templet:function (d) {
                        if(!isEmpty(d.specifications)){
                            let html = '';
                            for(let i = 0; i<d.specifications.length; i++){
                                html += '<span class="spec-span" style="margin-right: 5px">'+d.specifications[i]+'</span>';
                            }
                            return html;
                        }else{
                            return '';
                        }
                    }},
                {field: 'price', title: '货品售价', align: 'center'},
                {field: 'number', title: '货品数量', align: 'center'},
                {title: '操作',toolbar: '#productBar', align: 'center'},
            ]]
        });
        //商品参数信息表格数据
        table.render({
            elem: '#attribute_table',
            data: attrData,
            skin: 'line',
            autoSort:false,
            page: false,
            cols: [[
                {field: 'name', title: '参数名', align: 'center'},
                {field: 'value', title: '参数值', align: 'center'},
                {title: '操作',toolbar: '#attrBar', align: 'center'},
            ]]
        });
    }
    // 加载商品分类下拉框
    function init() {
        $.ajax({
            url: '/category/getCategoryPidList',
            type: 'get',
            dataType: 'json',
            success: function (suc) {
                var category1Html = '';
                if(suc.code === 0){
                    category1Html += '<option value="">请选择父类目</option>';
                    $.each(suc.data, function(i, v) {
                        category1Html += '<option value="'+v.categoryId+'">'+v.categoryName+'</option>';
                    });
                }else{
                    category1Html += '<option value="" selected="" disabled="">暂无数据</option>';
                }
                $("#category1").html(category1Html);
                form.render("select");
            }
        });
    }
    // 商品分类二级菜单联动
    form.on('select(category1)',function (data) {
        var v = data.value;
        if(v !== ''){
            $("#category2").empty();
            $.ajax({
                url: '/category/getCategoryListByPid',
                type: 'get',
                dataType: 'json',
                data: {'categoryId': v},
                success: function (suc) {
                    var category2Html = '';
                    if(suc.code === 0){
                        category2Html += '<option value="">请选择子类目</option>';
                        $.each(suc.data, function(i, v) {
                            category2Html += '<option value="'+v.categoryId+'">'+v.categoryName+'</option>';
                        });
                    }else{
                        category2Html += '<option value="" selected="" disabled="">暂无数据</option>';
                    }
                    $("#category2").html(category2Html);
                    form.render("select");
                }
            });
        }else{
            $("#category2").empty();
            $("#category2").html('<option value="">请选择子类目</option>');
            form.render("select");
        }
    })

})

/**
 * isNull() 通用非空判断
 * getNullStr() 空值变为空字符串
 */
function isEmpty(val){
    if(val===undefined||val===null||val===""){
        return true;
    }
    return false;
}

/**
 * 数据排序
 * _data    要排序的数据
 * _field   要排序的字段
 * _type    排序方式true正序，false倒序
 */
function arraySort(_data,_field,_type){
    if(typeof(_data) == 'object'){
        if(_type){
            _data.sort(function(x, y){
                if(x[_field] == '' || y[_field] == ''){
                    // 空值数据为最小排序，放在最后
                    if(x[_field] < y[_field]){
                        return 1;
                    }else
                    if(x[_field] > y[_field]){
                        return -1;
                    }else
                    if(x[_field] == y[_field]){
                        return 0;
                    }
                }else{
                    if(x[_field] > y[_field]){
                        return 1;
                    }else
                    if(x[_field] < y[_field]){
                        return -1;
                    }else
                    if(x[_field] == y[_field]){
                        return 0;
                    }
                }

            });
        }else{
            _data.sort(function(x, y){
                if(x[_field] < y[_field]){
                    return 1;
                }else
                if(x[_field] > y[_field]){
                    return -1;
                }else
                if(x[_field] == y[_field]){
                    return 0;
                }
            });
        }
    }
    return _data;
}

/**
 * 多数组元素排列组合
 * _data    数组
 */
function arrayCombination(_data) {
    let _result = [[]];
    for (let i = 0; i < _data.length; i++) {
        let tarr = [];
        for (let j = 0; j < _result.length; j++){
            for (let k = 0; k < _data[i].length; k++){
                tarr.push(_result[j].concat(_data[i][k]));
            }
        }
        _result = tarr;
    }
    return _result;
}