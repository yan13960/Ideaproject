<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表达式</title>
</head>
<body>

    <%
        //通过jsp内置对象存值
        request.setAttribute("msg","msg的值");
        String msg2=(String) request.getAttribute("msg");
    %>

    <%=msg2%>
    通过el表达式获取值  ：  ${msg2}

</body>
</html>
