<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/29
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${pageContext.request.contextPath  }

<%--http://localhost:8888/ServletDayDemo008Day02/test004.do?userName=%E5%BC%A0%E4%B8%89&userId=11111&likes=1&likes=2&likes=3--%>


<%--
  请求方式常用两种
   method="get" 默认 get

   method="post"

--%>

<form action="${pageContext.request.contextPath }/test004.do" method="post">
        <!--<input /> 如果就是一个这样的，其实系统默认给我们加了一个type="text"
            type="text" 文本输入框
        -->
        用户名：<input  type="text" name="userName"/>
        <br>
        <!--type="password"密码输入框 -->
        id：<input  type="text" name="userId"/>
        <br>
        兴趣爱好  <%-- name="likes" value="1"  有些同学会少了  name 或 value  --%>
        <input type="checkbox"  name="likes" value="1">  抄代码
        <input type="checkbox"  name="likes" value="2">  多抄代码
        <input type="checkbox"  name="likes" value="3">  只有多抄代码才能理解
        <!--type="submit" 提交按钮 当我们一点会找到form  action=""-->
        <input type="submit"  value="提交" />

    </form>

</body>
</html>
