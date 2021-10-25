<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/1
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--jsp包括了  html css js--%>
    <h1> HTML代码</h1>

    <%--jsp可以写JAVA代码--%>
    <%
        String str = "ddd";
        System.out.println(str);


    %>
外面就不是JAVA代码
    <%
        String str2 = "ddd";
        System.out.println(str2);
    %>

    <%
        String str3 = "ddd";
    %>

    <%--我不用System.out.println(str3);--%>
    <%=str3%>

</body>
</html>
