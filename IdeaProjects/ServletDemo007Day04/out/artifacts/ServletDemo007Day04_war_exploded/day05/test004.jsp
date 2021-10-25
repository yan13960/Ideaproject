<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/3
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%

        //JAVA后台代码就是这样写的，加上这一句
        //HttpSession session1 = request.getSession(true);
        session.setMaxInactiveInterval(5);//秒
        session.setAttribute("msgSession","5秒");
    %>

</body>
</html>
