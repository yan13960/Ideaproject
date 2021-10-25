package com.javacto.action;

import com.javacto.po.User;

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
@WebServlet("/sessionGet")
public class SessionAction2 extends HttpServlet {

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

        // 获取session
         HttpSession session = req.getSession();
         User user =(User) session.getAttribute("user");

         //这里可以判断 user 是否有值

         req.getRequestDispatcher("/sessionUser.jsp").forward(req,resp);


    }
}
