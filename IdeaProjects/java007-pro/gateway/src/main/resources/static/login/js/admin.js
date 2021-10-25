layui.use(['carousel', 'form','jquery'], function(){
    var carousel = layui.carousel,
        $ = layui.jquery,
        form = layui.form;

    //自定义验证规则
    form.verify({
        pass: [/^[\S]{6,12}$/,'密码必须6到12位，且不能出现空格'],
        vercodes: function(value){
            //获取验证码
            var zylVerCode = $(".zylVerCode").html();
            if(value!==zylVerCode.toLowerCase()){
                return '验证码错误';
            }
        },
        content: function(value){
            layedit.sync(editIndex);
        }
    });

    //监听提交
    form.on('submit(demo1)', function(data){
        var _data  = data;
        console.log(_data.field)
        $.ajax({
            type: "get",
            url: "/login/admin",
            data: {adminName:_data.field.adminName,adminPassword:_data.field.adminPassword},
            dataType: "json",
            contentType:"application/x-www-form-urlencoded",
            success: function(data){
                if (data.code == "0"){
                    location.href = '/page/admin/home.html'
                }else if (data.code == "500"){
                    layer.msg(data.msg);
                    return false;
                }
            }
        });
        // $.get('/login/admin', data.field, function (suc) {
        //
        // })
        return false;
    });

    //设置轮播主体高度
    var zyl_login_height = $(window).height()/1.2;
    var zyl_car_height = $(".zyl_login_height").css("cssText","height:" + zyl_login_height + "px!important");

    //Login轮播主体
    carousel.render({
        elem: '#zyllogin'//指向容器选择器
        ,width: '100%' //设置容器宽度
        ,height:'zyl_car_height'
        ,arrow: 'always' //始终显示箭头
        ,anim: 'fade' //切换动画方式
        ,autoplay: true //是否自动切换false true
        ,arrow: 'hover' //切换箭头默认显示状态||不显示：none||悬停显示：hover||始终显示：always
        ,indicator: 'none' //指示器位置||外部：outside||内部：inside||不显示：none
        ,interval: '10000' //自动切换时间:单位：ms（毫秒）
    });

    //监听轮播--案例暂未使用
    carousel.on('change(zyllogin)', function(obj){
        var loginCarousel = obj.index;
    });

    //粒子线条
    $(".zyl_login_cont").jParticle({
        background: "rgba(0,0,0,0)",//背景颜色
        color: "#fff",//粒子和连线的颜色
        particlesNumber:100,//粒子数量
        //disableLinks:true,//禁止粒子间连线
        //disableMouse:true,//禁止粒子间连线(鼠标)
        particle: {
            minSize: 1,//最小粒子
            maxSize: 3,//最大粒子
            speed: 30,//粒子的动画速度
        }
    });

});