layui.use('table', function(){
    var table = layui.table;

    table.render({
        elem: '#shop_table',
        url:'/shop/list',
        cellMinWidth: 80,
        cols: [[
            {field:'shopId', title: 'ID', sort: true},
            {field:'shopName', title: '店铺名称'},
            {field:'shopSlogan', title: '宣传标语'}
        ]]
    });


});