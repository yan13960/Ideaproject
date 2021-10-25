<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/10
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>


        //定义json格式

      /*  var users = {"id":"1","userName":"张三","pwd":"123456"};
        console.log(users.id);
        console.log(users.userName);
        console.log(users["pwd"]);*/

      /*  var usr2 = {"id":"2","userName":"李四","pwd":"66666"}
        console.log(users);*/

      var  userss= [
          {"id":"1","userName":"张三1","pwd":"123456"},
          {"id":"2","userName":"张三2","pwd":"2222"},
          {"id":"3","userName":"张三3","pwd":"3333"}
      ];

      /*  console.log(userss[0].id);
        console.log(userss[1].userName);
        console.log(userss[2]["pwd"]);*/
      for(var i in userss){
          console.log(userss[i]);
      }

    </script>
</head>
<body>

</body>
</html>
