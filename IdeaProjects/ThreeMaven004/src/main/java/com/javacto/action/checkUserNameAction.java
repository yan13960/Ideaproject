package com.javacto.action;

import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
@WebServlet("/checkUserName.do")
public class checkUserNameAction extends HttpServlet {
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
        PrintWriter out=resp.getWriter();

        //1.获取请求参数
        String userName=req.getParameter("userName");
        String location=req.getParameter("location");

        //2.创建业务层代码
        UserService userService=new UserServiceImpl();

        //3.通过用户名查询.返回  User对象也可以  返回boolean
        boolean flag=userService.findUserByName(userName);
        if (flag==true){
            out.print("0");
        }else {
            out.print("1");
        }
    }
}
