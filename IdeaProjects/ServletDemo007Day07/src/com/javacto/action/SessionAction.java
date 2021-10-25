package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@WebServlet("/sessionAdd")
public class SessionAction  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        HttpSession session = req.getSession(true);
        //这些单位不用记，忘记了baidu即可
        session.setMaxInactiveInterval(10000);

        //2.创建业务层代码
        UserService userService = new UserServiceImpl();
        //3.调用查询所有方法
        User user = userService.findUserByID(14);
        session.setAttribute("user",user);
    }
}
