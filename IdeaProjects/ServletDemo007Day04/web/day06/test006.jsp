<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>多重选择</title>
</head>
<body>
    <c:set var="age" value="78"></c:set>

    条件：
   0-24   好好学习，天天向上  不包括24
   24-30  可以结婚生娃  包括24  不包括 30
   30-50   一边工作，一边浪
   50-70    安乐死
   70以后， 房产过期，自己想办法
    <br>
    输入结果为：

    <c:choose>
        <c:when test="${age>=1 && age<24}">好好学习，天天向上 </c:when>
        <c:when test="${ age<30}">可以结婚生娃</c:when>
        <c:when test="${age<50}">一边工作，一边浪</c:when>
        <c:when test="${age<70}">安乐死</c:when>
        <c:otherwise>房产过期，自己想办法</c:otherwise>
    </c:choose>







</body>
</html>
