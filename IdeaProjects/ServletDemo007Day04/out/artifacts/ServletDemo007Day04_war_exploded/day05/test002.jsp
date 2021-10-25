<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/3
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <%-- 作用域 page(pageContext)  request session   application --%>

        <%
            pageContext.setAttribute("pageContextSbq","pageContext的值");
            request.setAttribute("requestSbq","request的值");
            session.setAttribute("sessionSbq","session的值");
            application.setAttribute("applicationSbq","application的值");
        %>

        <%--pageContext 只对当前jsp有效

         request 一次请求，一次响映有效

          session:一次会话  什么是会话  默认是30分钟

           有3种方式修改
          application：整个web有效
             1.因为在tomcat  D:\java\tools\tomcat\tomcat8007\apache-tomcat-8.5.66\conf\web.xml
               <session-config>
                    <session-timeout>30</session-timeout>   30默认30分钟，我们所有创建的工程默认30分钟
                </session-config>
              2.自己在本工程的web.xml 加上  在哪个工程修改了，就对哪个工程有效。 用了这种  1方法无效
                <session-config>
                    <session-timeout>1</session-timeout>
                </session-config>
              3.在自己的jsp加上时间，用了上面两种没效果
        --%>

        获取刚存通过这作用域存的值
        <br>
        pageContext:<%=pageContext.getAttribute("pageContextSbq")%>
        <br>
        request:<%=request.getAttribute("requestSbq")%>
        <br>
        session:<%=session.getAttribute("sessionSbq")%>
        <br>
        application:<%=application.getAttribute("applicationSbq")%>

        <a href="${pageContext.request.contextPath}/day05/test003.jsp">从002跳转到003.jsp A标签</a>

       <%-- <%
            request.getRequestDispatcher("/day05/test003.jsp").forward(request,response);
        %>--%>

</body>
</html>
