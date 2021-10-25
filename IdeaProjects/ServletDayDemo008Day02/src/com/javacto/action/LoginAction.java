package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
public class LoginAction extends HttpServlet {


    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //我先加上这一句  如果接收到的有乱码就这加这  今天不讲
        req.setCharacterEncoding("UTF-8");
    //处理响映的编码格式
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        System.out.println("登陆");  //写到这里请所有同学务必测试，是否能进来
        //1.获取前端的请求参数   都是通过前端的这个获取 name="userName"
        String nameSbq=  req.getParameter("userName");
        String pwdSbq=  req.getParameter("pwdSbq");

        System.out.println("用户名为"+nameSbq);
        System.out.println("密码为"+pwdSbq);
        //2.创建业务层对象
        UserService userService = new UserServiceImpl();
        //3.调用方法  没有登陆方法，我就写个查询意思一下，走一流程
        //后面还有很多次课，一步一步来。。
        List<User>  list= userService.queryAll();

        for(User u:list){
            System.out.println(u);
        }

        //4.返回结果  现在不返回，还没学到，先走思路
        //这个代码大家不要写，也不要复制，我是为了讲思路，下次课程需要讲jsp   就是要解决这些问题，解决Servlet写html 代码问题
        out.print("<table>");
        out.print("<tr><td>用户名</td><td>密码</td><td>性别</td><td>日期</td></tr>");
        for (User user : list) {
            //System.out.println(user);
            out.print("<tr>");
            out.print("<td>"+user.getUserName()+"</td>");
            out.print("<td>"+user.getPwd()+"</td>");
            out.print("<td>"+user.getSex()+"</td>");
            out.print("<td>"+user.getAddress()+"</td>");
            out.print("</tr>");
        }
        out.print("登陆成功");
        out.print("</table>");






    }
}
