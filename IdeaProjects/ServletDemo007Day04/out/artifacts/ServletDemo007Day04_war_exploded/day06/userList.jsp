<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/1
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必需加这句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table border="1" cellspacing="0" cellpadding="0" width="80%">
            <tr>
                <td>id</td>
                <td>userName</td>
                <td>sex</td>
                <td>date</td>
                <td>address</td>
                <td>操作</td>
            </tr>
        <%--sbqSbq 是我在   req.setAttribute("sbqSbq",list);--%>

            <%--
             begin="2" end="2" 使用少，一般不用  分页后面会讲
             <c:forEach var="li" items="${sbqSbq}" >
            <c:forEach var="li" items="${sbqSbq}" begin="2" end="2">
            --%>
        <c:forEach var="li" items="${sbqSbq}" >
            <tr>
                <td>
                    ${li.id}
                </td>
                <td> ${li.userName}</td>
                <td> ${li.sex}</td>
                <td> ${li.date}</td>
                <td> ${li.address}</td>
                <td>
                    <%--
                     注意，这里不能有空格
                      deleteUser?id=1  传一个
                    deleteUser?id=1&userName=张三  传两个
                    deleteUser?id=1&userName=张三&sex=2  传三个

                    --%>
                    <a href="${pageContext.request.contextPath}/deleteUser?id=1">删除1</a>
                    <a href="${pageContext.request.contextPath}/deleteUser?id=1&userName=张三">删除2</a>
                        <a href="${pageContext.request.contextPath}/deleteUser?id=${li.id}&userName=${li.userName}">删除3</a>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
