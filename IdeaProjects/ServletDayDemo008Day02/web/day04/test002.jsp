<%@ page import="com.javacto.service.UserService" %>
<%@ page import="com.javacto.service.UserServiceImpl" %>
<%@ page import="com.javacto.po.User" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/1
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <%--把之前JAVA的测试代码放在这里  以后开发90%不会这样写代码--%>
    <%--这个代码不要研究，了解即可  --%>
    <%
        UserService userService = new UserServiceImpl();
        List<User> list  = userService.queryAll();
        System.out.println("JSP开始");
        for(User u:list){
            System.out.println(u);

    %>
    <%=u%> <br>

    <%}%>


</body>
</html>
