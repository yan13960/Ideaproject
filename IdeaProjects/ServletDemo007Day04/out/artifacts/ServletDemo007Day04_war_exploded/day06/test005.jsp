<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>if非常非常重要，没有else</title>
</head>
<body>

    <c:set var="sex" value="17"></c:set>
    条件： 如果年龄小于18(不包括)  要听妈妈话，好好学习天天向上， 大于18  （包括） 否则  爱干嘛干嘛
    <br>
    <%--<c:if test="${sex<18}">  要听妈妈话，好好学习天天向上  </c:if>

    <c:if test="${sex>=18}">  爱干嘛干嘛 </c:if>--%>

   <%-- <c:if test="${sex<18}" var="sbq1">  要听妈妈话，好好学习天天向上  </c:if>

    <c:if test="${sex>=18}" var="sbq2">  爱干嘛干嘛 </c:if>
    ${sbq1}

    ${sbq2}--%>


    <c:if test="${sex<18}" var="sbq1">  要听妈妈话，好好学习天天向上  </c:if>

    <c:if test="${!sbq1}" >  爱干嘛干嘛 </c:if>

</body>
</html>
