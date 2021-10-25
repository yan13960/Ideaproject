package com.javacto.action.day05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@WebServlet("/redirectB.do")
public class RedirectB  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");

        System.out.println("RedirectB  开始");

        //获取刚才A存的值
        String msg=req.getAttribute("msg").toString();

        System.out.println("获取的值为"+msg);




        System.out.println("RedirectB  结束 ");

    }
}
