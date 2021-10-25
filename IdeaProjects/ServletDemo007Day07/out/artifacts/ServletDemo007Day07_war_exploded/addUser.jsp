<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/8
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必需加这句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

    <script>

       /* $(function () {
            alert("测试是否可以使用");
        });*/

       function checkUserName(userName) {
           //alert("能进来吗？")
           $.ajax({
               type: "POST",
               url: "${pageContext.request.contextPath}/checkUserName.do",
               data: "userName="+userName+"&location=Boston",
               success: function(msg){
                   var userNameErr =document.getElementById("userNameErr");

                   if(msg==0 ){
                       userNameErr.innerHTML="用户名已经注册不能再注册";
                   }else {
                       userNameErr.innerHTML="可以使用";
                   }

               }
           });
       }

       function  checkAddress() {
            alert("checkAddress")
             //这里面之前怎么写就怎么写
            return true;
       }

       function  checkPwd() {
           alert("checkPwd")
           return true;
       }

       function  cccc() {
          /* var userNameErr =document.getElementById("userNameErr").innerHTML;
           if(userNameErr=='可以使用'  ){
               alert("可以使用")
           }else {
               alert("不可以使用")

               return  false;
           }*/

           //alert("OK")
           return checkAddress()&&checkPwd();

       }

       // 所有同学必需把表单验证完成，加上ajax技术， 创建 dog  手机 电脑表  使用一个字段完成
    </script>


</head>
<body>


<form action="${pageContext.request.contextPath}/addUser.do" method="post" onsubmit="return cccc();">


    用户名:<input name="userName" value="${user.userName}"  onchange="checkUserName(this.value)">
    <font id="userNameErr"></font>
    <br>
    地址:<input name="address" value="${user.address}"  onchange="checkAddress()">

    密码：<input type="password" name="pwd" value="${user.pwd}"  onchange="checkPwd()">

    性别：<input type="radio" name="sex" value="1" <c:if test="${user.sex==1}">checked</c:if> > 男
    <input type="radio" name="sex" value="2" <c:if test="${user.sex==2}">checked</c:if>> 女
    <input type="radio" name="sex" value="0" <c:if test="${user.sex==0}">checked</c:if>> 未知

    <input type="submit" value="提交">

</form>

<br>
使用三目运算符

<c:set var="msg" value="11"></c:set>
${msg=='11'    ?   'add'   :  'update'}
</body>
</html>
