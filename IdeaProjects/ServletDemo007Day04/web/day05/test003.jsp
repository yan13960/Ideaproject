<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/3
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

获取刚存通过这作用域存的值
<br>
pageContext:<%=pageContext.getAttribute("pageContextSbq")%>
<br>
request:<%=request.getAttribute("requestSbq")%>
<br>
session:<%=session.getAttribute("sessionSbq")%>
<br>
application:<%=application.getAttribute("applicationSbq")%>


</body>
</html>
