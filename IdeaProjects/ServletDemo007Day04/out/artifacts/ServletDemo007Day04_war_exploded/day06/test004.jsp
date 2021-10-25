<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%--isELIgnored="false 开启对EL表达式的支持，有时jsp没有效果--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSTL表达式</title>
</head>
<body>
    <h1>JSTL的使用</h1>
    <h2>Set标签的使用</h2>
    使用jstl表存值<c:set var="blSbqq" value="10"></c:set> <br>
    使用EL表达式获取值${blSbqq}   <br>
    这是使用jstl表达式获取值，已经out  没有人用 <c:out value="${blSbqq}"></c:out>  <br>

    <h2>存值的时候加上作用域</h2>
    <c:set value="page的值" var="pageMsg" scope="page"></c:set>
    <c:set value="request的值" var="requestMsg" scope="request"></c:set>
    <c:set value="session的值" var="sessionMsg" scope="session"></c:set>
    <c:set value="application的值" var="applicationMsg" scope="application"></c:set>

    我能不能获取上面所有的值呢?<br>
    pageMsg：  ${pageMsg}<br>
    requestMsg： ${requestMsg}<br>
    sessionMsg：${sessionMsg}<br>
    applicationMsg：${applicationMsg}<br>

    现在还可以吗 ？<br>
    pageMsg：  ${sessionScope.pageMsg}<br>
    requestMsg： ${applicationScope.requestMsg}<br>
    sessionMsg：${applicationScope.sessionMsg}<br>
    applicationMsg：${applicationScope.applicationMsg}<br>

</body>
</html>
