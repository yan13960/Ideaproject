package com.javacto.action.day05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe
 *   ForwardA 跳转到  ForwardB
 * 作者：曾昭武  adam8831
 */
@WebServlet("/forwardA.do")
public class ForwardA  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        System.out.println("ForwardA  开始");


        //1.通过 HttpServletRequest存值
        req.setAttribute("msg","ForwardA存的值");

        //2.通过转发的方式跳转到B
        req.getRequestDispatcher("/forwardB.do").forward(req,resp);



        System.out.println("ForwardA  结束 ");

    }
}