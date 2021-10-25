<%@ page import="com.javacto.service.UserService" %>
<%@ page import="com.javacto.service.UserServiceImpl" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/3
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        /*request 我可以直接拿过来使用。为什么因为这是jsp的内置对象 */

        //请求  HttpServletRequest
        request.setAttribute("sbq","大在");

        //响映  HttpServletResponse
        PrintWriter outs = response.getWriter();
        outs.print("响映结果到浏览器");

        out.print("out其实已经out了，不用");

    %>

</body>
</html>
