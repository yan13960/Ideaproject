var _data;
var picUrl;
var picUrlIndex = 0;

layui.config({
    base:'/js/treeTable/'
}).use(['treeTable','layer','util','form','jquery','upload'],function () {
    var treeTable = layui.treeTable;
    var layer = layui.layer;
    var $ = layui.jquery;
    var form = layui.form;
    var upload = layui.upload;

    form.render();
    form.render("select");

    form.on('submit(addForm)',function (data) {
        window._data = data;
    })

    var picUrlupload = upload.render({
        elem: '#picUrlUpload',
        url: '/category/upload',
        acceptMime:'image/*',
        auto: true,
        size: 5120,
        choose:function (obj) {
            var files = obj.pushFile();
            picUrlIndex = picUrlIndex+1;
            var len = getJsonLength(files);
            obj.preview(function (index,file,result) {
                if(parseInt(len)>1){
                    layer.msg("只能上传一张类目图片!",{icon:5});
                    delete files[index];
                    len = getJsonLength(files);
                }else{
                    $('#picUrlPreview').append('<img id="picUrlPreview'+index+'" style="width: 256px;' +
                        'height: 144px;margin-left: 10px" src="'+result+'" class="layui-upload-img">')
                    $('#picUrlPreview'+index).bind('dblclick',function () {
                        delete files[index];
                        len = getJsonLength(files);
                        picUrlIndex = picUrlIndex-1;
                        $(this).remove();
                    })
                }
            })
        },
        done:function (res) {
            console.log(1111111111111111);
            console.log(res.filePath);
        }
    });

    function getJsonLength(jsonData){
        var jsonLength = 0;
        for(var item in jsonData){
            jsonLength++;
        }
        return jsonLength;
    }

    treeTable.render({
        elem:'#categoryTable',
        url:'/category/list',
        toolbar: '#categoryBar',
        height:'full',
        tree:{
            iconIndex: 0,
            isPidData: true,
            idName: 'categoryId',
            pidName: 'pid'
        },
        cellMinWidth:80,
        cols:[[
            {field:'categoryId',title:'ID',sort:true},
            {field:'categoryName',title:'类目名称'},
            {
                field: 'picUrl',
                title: '类目图片',
                align: 'center',
                templet: function (data) {
                    var picUrl = data.picUrl;
                    return "<div onclick='show(\""+picUrl+"\")'><img src='"+ picUrl +"'></div>"
                }
            },
            {title: '操作',toolbar:'#categoryLineBar',align: 'center'}
        ]]
    });

    treeTable.on('toolbar(categoryTable)',function (obj) {
        var event = obj.event;
        var data = obj.data;
        if(event == 'add'){
            layer.open({
                type:1,
                title:"新增类目",
                area:['800px','500px'],
                shadeClose: true,
                content:$("#addDiv")
            })
        }
    })


    treeTable.on('tool(categoryTable)',function (obj) {
        var event = obj.event;
        var data = obj.data;
        if(event == 'del'){
            if (data.pid !== 0) {
                layer.confirm('确定删除当前二级类目？',function (index) {
                    $.ajax({
                        url: '/category/del',
                        type: 'get',
                        dataType: 'json',
                        data:{'categoryId':data.categoryId,'level':2},
                        success:function (data) {
                            if(data.code == 0){
                                obj.del();
                                layer.close(index);
                                layer.msg(data.msg,{icon:6});
                            }else{
                                layer.msg(data.msg,{icon:5});
                            }
                        }
                    })
                })
            }else{
                layer.confirm('确定删除当前一级类目,这会删除所有对应二级类目？',function (index) {
                    $.ajax({
                        url: '/category/del',
                        type: 'get',
                        dataType: 'json',
                        data:{'categoryId':data.categoryId,'level':1},
                        success:function (data) {
                            if(data.code == 0){
                                obj.del();
                                layer.close(index);
                                layer.msg(data.msg,{icon:6});
                            }else{
                                layer.msg(data.msg,{icon:5});
                            }
                        }
                    })
                })
            }
        }
        if(event == 'edit'){
            layer.msg(data);
        }
    })

});

function show(url) {
    layer.open({
        type: 1,
        title: false,
        closeBtn: 0,
        area: ['auto'],
        skin: 'layui-layer-nobg',
        shadeClose: true,
        content: "<img src='"+ url +"'>"
    });
}