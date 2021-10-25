<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        //这个代码以后都是在后台传的，我是为了讲为方便
        request.setAttribute("sex","2");
    %>

   <%-- <form action="test008.jsp" method="get">
        <c:if test="${sex==1}">checked1</c:if>
        <c:if test="${sex==2}">checked2</c:if>
        ${sex}
        性别:
        <input type="radio" value="${sex}" name="sex" checked> 男
        <input type="radio" value="${sex}" name="sex"> 女

        <input type="submit" value="提交">
    </form>--%>

     <form action="test008.jsp" method="get">

           性别:
           <input type="radio" value="${sex}" name="sex" <c:if test="${sex==1}">checked</c:if>> 男
           <input type="radio" value="${sex}" name="sex" <c:if test="${sex==2}">checked</c:if>> 女

           <input type="submit" value="提交">
       </form>



    <%
        Date date = new Date();
        request.setAttribute("date",date);
    %>
    <br>
    日期为:1
    <input value="${date}">
    <br>

    日期为:2
    <fmt:formatDate value="${date}" pattern="yyyy-MM-dd"></fmt:formatDate>

    <br>
    日期为:3
    <input value='<fmt:formatDate value="${date}" pattern="yyyy-MM-dd"></fmt:formatDate>'>


</body>
</html>
