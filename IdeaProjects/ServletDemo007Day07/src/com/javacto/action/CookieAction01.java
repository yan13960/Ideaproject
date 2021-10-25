package com.javacto.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
@WebServlet("/cookieAdd.do")
public class CookieAction01 extends HttpServlet {

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

        //2.设置将要存入cookie的字符串  只能存字符串  不能存User对象  Session 可以存对象
        //Cookie 存的值比较少，最多的就用户名  密码
        String str1 = URLEncoder.encode("sbqSqb","utf-8");
        String str2 = URLEncoder.encode("张三","utf-8");

        //3.创建Cookie ,把str1 存入cookie  必需是键值对的方式
        Cookie cookie = new Cookie("sbqKey",str1);
        Cookie cookie2 = new Cookie("sbqKey2",str2);

        /**
         * 4。设置cookie 的过期时间  如果没有设置，关闭浏览器立即失效
         *  等于 0 直接删除  不保存
         *  <0 保存在内存中
         *  >1  保存在硬盘中  秒为单为  60
         */
        //cookie.setMaxAge(0);//直接删除  不保存
       // cookie.setMaxAge(-1);//<0 保存在内存中
        cookie.setMaxAge(1200);//120秒
        cookie2.setMaxAge(1000);

        //5.很多同学少了这一步  必需将cookie 响映给浏览器，如果不操作，cookie不保存
        resp.addCookie(cookie);
        resp.addCookie(cookie2);

    }
}
