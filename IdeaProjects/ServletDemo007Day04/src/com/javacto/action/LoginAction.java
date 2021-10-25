package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe
 * @WebServlet("/login.do")    不能少/
 * 加了这句，web.xml就不需要写了
 * 作者：曾昭武  adam8831
 */
@WebServlet("/login.do")
public class LoginAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        //1.获取前端的请求参数   都是通过前端的这个获取 name="userName"
        String nameSbq=  req.getParameter("userName");
        String pwdSbq=  req.getParameter("pwdSbq");


        //这里必需要判断吧，判断 用户名，密码是否为空，不为空则调用登陆的方法


        //2.创建业务层代码
        UserService userService = new UserServiceImpl();
        //3.调用登陆的方法
        User user = userService.login(nameSbq,pwdSbq);
        //4.判断 user是否有值，有值代表登陆成功  没值代表登陆失败
        if (null!=user){
            System.out.println("登陆成功");
            //实际开发，会再去调用一个查询用户信息的url   req.getRequestDispatcher("填你的路径").forward(req,resp);
            req.getRequestDispatcher("/queryUserAll.do").forward(req,resp);
        }else {
            System.out.println("登陆失败");
            //登陆失败会跳转转login.jsp   req.getRequestDispatcher("填你的路径").forward(req,resp);
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
