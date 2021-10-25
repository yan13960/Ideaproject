layui.use(['table', 'form', 'jquery', 'layer'], function () {
    var table = layui.table,
        form = layui.form,
        $ = layui.jquery,
        layer = layui.layer;

    table.render({
        elem: '#productTable',
        id: 'productTable',
        height: 'full-20',
        url: '/product/list',
        method: 'get',
        toolbar: '#toolbarDemo',
        defaultToolbar: [''],
        cols: [[
            {type: 'checkbox'},
            {field: 'productId',event: 'collapse', width: 80, title: 'ID', align: 'center',templet: function(d) {
                    return '<div style="position: relative;\n' + '    padding: 0 10px 0 20px;">' + d.productId +
                        '<i style="left: 0px;" lay-tips="展开" class="layui-icon layui-colla-icon layui-icon-right"></i></div>'
                }},
            {field: 'productName', title: '商品名称', align: 'center'},
            {
                field: 'picUrl', width: 95, title: '首页图', align: 'center',
                templet: function (data) {
                    if(data.productId>1569){
                        var url = JSON.parse(data.picUrl)[0];
                    }
                    return "<div><img src='" + url + "' style='height:40px;width=40px'></div>";
                }
            },
            {field: 'productDetail', title: '商品详情页', width: 100, toolbar: '#checkProductDetail', align: 'center'},
            {field: 'productUnit', width: 70, title: '单位', align: 'center'},
            {field: 'productPrice', width: 100, title: '市场售价', align: 'center'},
            {field: 'productPrice', width: 100, title: '当前价格', align: 'center'},
            {field: 'isOnSale', width: 100, title: '是否上架', align: 'center',templet:function (d) {
                    if(d.isOnSale === 0){
                        return '<span class="sale-span light" lay-event="onSale">下架</span>';
                    }else{
                        return '<span class="sale-span" lay-event="offSale">在售</span>';
                    }
                }},
            // {fixed: 'right', width:130, title: '操作', toolbar: '#productBar', align: 'center'}
        ]],
        page: true,
        limits: [20, 100, 500, 1000],
        limit: 20,
        loading: true,
        count: 1000,
        parseData: function (res) {
            return {
                "code": res.code,
                "msg": res.msg,
                "count": res.count,
                "data": res.data
            };
        },
    });

    //监听头部工具栏
    table.on('toolbar(productTable)',function (obj) {
        let data = obj.data;
        let event = obj.event;
        //商品上架
        if(event === 'add'){
            let index = layer.open({
                type:2,
                title:'增加商品',
                area : ['1000px' , '800px'],
                shadeClose:true,
                content: "add.html",
                end: function () {
                    table.reload('productTable', {
                        method: 'get',
                    });
                }
            });
            layer.full(index);
        }
    })

})