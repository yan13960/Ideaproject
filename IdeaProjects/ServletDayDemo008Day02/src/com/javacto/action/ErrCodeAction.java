package com.javacto.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;

/**
 * describe
 * 作者：曾昭武  adam8831
 */
public class ErrCodeAction extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //我先加上这一句  如果接收到的有乱码就这加这  今天不讲
        req.setCharacterEncoding("UTF-8");

        //String str = null;
       // System.out.println(str.toString());


       // System.out.println("这里会报错");

        String strNum = "123ABC";
        Integer num = Integer.parseInt(strNum);

        System.out.println(num);
    }



}