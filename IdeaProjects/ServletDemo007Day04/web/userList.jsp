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

查询所有建议大家先测试成功了， 再写代码，就是后面的都成功，这里再加代码
后台流程全跑通了，如果加了这里面代码，出错就知道错在这里面了。请务必这样测试写代码
目前需要使用jstl表达式 后面会重点讲，今天不解释，只写


1.必需导包，我提供的工程中就有，如果大家找不到, 如果没效果，必需把jar复制到tomcat lib下面
2.如果还不行， isELIgnored="false"

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

        <c:forEach var="li" items="${sbqSbq}">
            <tr>
                <td>
                    ${li.id}
                </td>
                <td> ${li.userName}</td>
                <td> ${li.sex}</td>
                <td> ${li.date}</td>
                <td> ${li.address}</td>
                <td>操作


                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
