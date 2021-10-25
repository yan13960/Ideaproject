<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>登陆</title>
		<script>
			//不能为空
			var sbqNull= /^\s*$/g;

			function sbSbCheck() {
				var  userName=document.getElementById("userName").value;
				if(sbqNull.test(userName)){
					alert("用户名为能为空");
					return false;
				}
				return true;
			}
		</script>
	</head>
	<body>


		<form action="${pageContext.request.contextPath}/login.do" onsubmit="return sbSbCheck();">
			<!--<input /> 如果就是一个这样的，其实系统默认给我们加了一个type="text"
				type="text" 文本输入框
			-->
			用户名：<input  type="text" name="userName" id="userName"/>
			<br>
			<!--type="password"密码输入框 -->
			密码：<input  type="password" name="pwdSbq" id="pwdSbq"/>
			<br>
			<!--type="submit" 提交按钮 当我们一点会找到form  action=""-->
			<input type="submit"  value="登陆jsp" />

		</form>

	</body>
</html>
