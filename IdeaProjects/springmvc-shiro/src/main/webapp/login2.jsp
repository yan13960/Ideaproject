<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2021/10/23
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>login</title>
    <base href="<%=basePath%>">
</head>
<body>
<form id="loginForm">

    Username: <input type="text" name="username"/><br>

    Password: <input type="password" name="password"/>

    <input type="checkbox" name="rememberMe" value="true"/>Remember Me?
    <input type="button" id="loginBtn" value="login">
</form>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script>
    $("#loginBtn").click(function () {
        $.post("login",$("#loginForm").serialize(),function (data) {
            console.log(data)
            if (data =="success"){
                location.href="";
            }
        })
    })
</script>

</body>
</html>
