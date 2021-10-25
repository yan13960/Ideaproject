<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2021/6/15
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必需加这句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <script>
        function upd(sbq){
            //alert("删除成功"+sbq);
            //console.log(window.confirm("是否确认删除?"));
            //console.log(confirm("是否确认删除?"));
            if(confirm("是否确认修改?")){
                //window.location="";
                alert("修改成功"+sbq);
                return true;
            }
            else{
                alert("修改失败"+sbq);
                return false;
            }
        }
    </script>
</head>
<body>
jsp建议什么都不要写，看能不能进来
进来了再去写代码c
<form action="${pageContext.request.contextPath}/updateUser.do" method="post" >
    请所有同学注意，一定要加id
    id的值为：${user.id} 用户名为:${user.userName}
    <br>
    <input name="id" value="${user.id}" type="hidden">
    用户名:<input name="userName" value="${user.userName}">
    地址:<input name="address" value="${user.address}">

    性别：<input type="radio" name="sex" value="1" <c:if test="${user.sex==1}">checked</c:if> > 男
    <input type="radio" name="sex" value="2" <c:if test="${user.sex==2}">checked</c:if>> 女
    <input type="radio" name="sex" value="0" <c:if test="${user.sex==0}">checked</c:if>> 未知

    <input type="submit" value="提交" onclick="return upd(${user.id})">
</form>
</body>
</html>
