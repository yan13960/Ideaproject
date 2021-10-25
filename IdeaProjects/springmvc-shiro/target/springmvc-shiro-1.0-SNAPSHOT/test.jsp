<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2021/6/27
  Time: 14:41
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
${msg}
</body>
</html>
