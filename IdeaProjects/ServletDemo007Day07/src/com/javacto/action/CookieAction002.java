package com.javacto.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@WebServlet("/cookieGet.do")
public class CookieAction002 extends HttpServlet {

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
        //1.创建 输出流
        PrintWriter out = resp.getWriter();

        /**
         * 1.获取Cookies   请问获取是一个还是多个
         * Cookie 通常是有多个的，所有使用数组接受
         */
        Cookie[] cookies = req.getCookies();
        //2.判断 cookies 中是否有值
        if(null!=cookies){
            //循环
            for(Cookie c:cookies ){
                //获取值
                String str1 = c.getValue();
                //必需进行解码（如果是中文）
                String str2 = URLDecoder.decode(str1,"utf-8");

                out.println("<h1> 无解码的"+str1+"</h1>");
                out.println("<h1> 解码的"+str2+"</h1>");
            }
        }
    }
}