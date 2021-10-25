<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2021/10/23
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
<shiro:authenticated>欢迎您：<shiro:principal/> <a href="logout">登出</a>

<shiro:hasRole name="admin">
    您有admin角色
</shiro:hasRole>
<shiro:lacksRole name="admin">
    你没有admin角色
</shiro:lacksRole>
<shiro:hasPermission name="user:add">
        有user：add权限
</shiro:hasPermission>
<shiro:lacksPermission name="user:add">
        没有user：add权限
</shiro:lacksPermission>
</shiro:authenticated>
<shiro:notAuthenticated><a href="login.jsp">去登陆！</a> </shiro:notAuthenticated>



</body>
</html>
