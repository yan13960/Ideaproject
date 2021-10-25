<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/5
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="application/javascript"></script>
<html>
<head>
    <title>Title</title>
    <script>
        
        
        function sbqSbq() {
            alert("跳")
           // window.location='${pageContext.request.contextPath}/deleteUser?id=103&userName=张三3';
            var sbqSbqForm=document.getElementById("sbqSbqForm");
            //修改 action=""   <form id="sbqSbqForm" action=""  method="post" >
            sbqSbqForm.action="${pageContext.request.contextPath}/deleteUser";
            //提交
            sbqSbqForm.submit();

        }
    </script>
</head>
<body>


    <a href="${pageContext.request.contextPath}/deleteUser?id=100&userName=张三">跳转的第一种方式</a>

   <br>
    <a href="javascript:window.location='${pageContext.request.contextPath}/deleteUser?id=102&userName=张三2'">跳转的第二种方式</a>
    <br>
    <form id="sbqSbqForm"  method="post" >
        请问这样能解决吗？
        <input name="id" value="104">
        <input name="userName" value="张三4">
        <input type="button" value="提交" onclick="sbqSbq();">
    </form>

</body>
</html>
