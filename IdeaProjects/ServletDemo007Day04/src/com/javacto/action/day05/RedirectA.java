package com.javacto.action.day05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe  RedirectA跳转到 RedirectB
 * 作者：曾昭武  adam8831
 */
@WebServlet("/redirectA.do")
public class RedirectA  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        System.out.println("RedirectA  开始");
        //1.通过 HttpServletRequest存值
        req.setAttribute("msg","redirectA存的值");

        //2.通过重定向的方式跳转到B  必需带上工程名
       // resp.sendRedirect("/ServletDemo007Day04/redirectB.do");
        resp.sendRedirect("https://www.baidu.com/");



        System.out.println("RedirectA  结束 ");

    }
}
