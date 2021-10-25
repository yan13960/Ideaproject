<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 2021/6/15
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必需加这句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <style>
        .ok{
            color: green;
        }
        .err{
            color: red;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

    <script>
        $(function () {
            alert("测试是否可以使用")
        })
        function checkUserName(userName) {
            //alert("能进来吗？")
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/checkUserName.do",
                data: "userName="+userName+"&location=Boston",
                success: function(msg) {
                    var userNameErr = $("#userNameErr");
                    if (msg==0) {
                        $("#userNameErr").html("用户名已经注册");
                        userNameErr.removeClass().addClass("err");
                        return false;
                    } else {
                        $("#userNameErr").html("可以使用");
                        userNameErr.removeClass().addClass("ok");
                        return true;
                    }
                }
            });

        }
        function checkAll() {
            var userNameErr = $("#userNameErr").html();
            if (userNameErr.indexOf("用户名已经注册")==0){
                return false;
            }
            //不能为空
            var sbqNull = /^\s*$/g;

            var userName = $("#userName").val();
            var address = $("#address").val();
            var pwd = $("#pwd").val();
            if (sbqNull.test(userName)) {
                var userNameErr2 = $("#userNameErr");
                userNameErr2.html("用户名不能为空");
                userNameErr2.removeClass().addClass("err");
                return false;
            } else {
                var userNameErr3 = $("#userNameErr");
                userNameErr3.html("√");
                userNameErr3.removeClass().addClass("ok");
            }
            if (sbqNull.test(address)) {
                var addressErr = $("#addressErr");
                addressErr.html("地址不能为空");
                addressErr.addClass("err");
                return false;
            } else {
                var addressErr = $("#addressErr");
                addressErr.html("√")
                addressErr.removeClass().addClass("ok")
            }
            if (sbqNull.test(pwd)) {
                var pwdErr = $("#pwdErr");
                pwdErr.html("密码不能为空");
                pwdErr.removeClass().addClass("err")
                return false;
            } else if (pwd.length < 6) {
                var pwdErr = $("#pwdErr");
                pwdErr.html("密码需6位以上");
                pwdErr.removeClass().addClass("err");
                return false
            } else {
                var pwdErr = $("#pwdErr");
                pwdErr.html("√")
                pwdErr.removeClass().addClass("ok")
            }

            //alert("删除成功"+sbq);
            //console.log(window.confirm("是否确认删除?"));
            //console.log(confirm("是否确认删除?"));
            if(confirm("是否确认添加?")){
                //window.location="";
                alert("添加成功");
                return true;
            }
            else{
                alert("添加失败");
                return false;
            }
            return true;
        }


    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/addUser.do" onsubmit="return checkAll()" method="post">

    用户名:<input name="userName" id="userName" value="${user.userName}" onchange="checkUserName(this.value)" >
    <span id="userNameErr"></span>
    <br>
    地址:<input name="address" value="${user.address}" id="address" onchange="checkAddress()">
    <span id="addressErr"></span>
    <br>
    密码：<input type="password" name="pwd" id="pwd" value="${user.pwd}" >
    <span id="pwdErr"></span>
    <br>
    性别：<input type="radio" name="sex"  value="1"  > 男
    <input type="radio" name="sex" value="2"  > 女
    <input type="radio" name="sex" value="0" checked > 未知
    <br>
    <input type="submit" value="提交" onclick="add()">
</form>

</body>
</html>
