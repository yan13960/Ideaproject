<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必需加这句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<style>
    .ok{
        color: green;
    }
    .err{
        color: red;
    }
</style>
<script src="js/jquery-3.3.1.js"></script>
<script>
    //不能为空
    var sbqNull= /^\s*$/g;

    function sbSbCheck() {
        var  userName=$("#userName").val();
        var  pwd=$("#pwdSbq").val();
        if(sbqNull.test(userName)){
            var userNameErr = $("#userNameErr");
            userNameErr.html("用户名不能为空");
            userNameErr.addClass("err");
            return false;
        }else{
            var userNameErr = $("#userNameErr");
            userNameErr.html("√");
            userNameErr.removeClass().addClass("ok");
        }
        if (sbqNull.test(pwd)){
            var pwdErr=$("#pwdErr");
            pwdErr.html("密码不能为空")
            pwdErr.removeClass().addClass("err")
            return false;
        }else if (pwd.length<6){
            var pwdErr=$("#pwdErr");
            pwdErr.html("密码不能少于6位")
            pwdErr.removeClass().addClass("err");
            return  false;
        }else {
            var pwdErr=$("#pwdErr");
            pwdErr.html("√");
            pwdErr.removeClass().addClass("ok");
        }
        return true;
    }
</script>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.do" onsubmit="return sbSbCheck();">
    <!--<input /> 如果就是一个这样的，其实系统默认给我们加了一个type="text"
            type="text" 文本输入框
        -->
    用户名：<input type="text" name="userName" id="userName"/>
    <span id="userNameErr"></span>
    <br>
    <!--type="password"密码输入框 -->
    密码：<input type="password" name="pwdSbq" id="pwdSbq"/>
    <span id="pwdErr"></span>
    <br>
    <!--type="submit" 提交按钮 当我们一点会找到form  action=""-->
    <input type="submit" value="登录jsp"/>
</form>
</body>
</html>