package com.cold.action;

import com.cold.Service.ProvinceCityServcImpl;
import com.cold.Service.ProvinceCityServcie;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * describe
 * 作者：曾昭武
 */
@WebServlet("/getProvince.do")
public class ProvinceAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式 Request
        req.setCharacterEncoding("UTF-8");
        //处理  Response 响映编码格式
       // resp.setContentType("text/html;charset=UTF-8");
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();

        //1.创建业务层
        ProvinceCityServcie provinceCityServcie = new ProvinceCityServcImpl();
       /* //2.调用业务层
        List<Province1> list =  provinceCityServcie.getProvince();
        //3.把数据转为json格式
        JSONArray listJson = JSONArray.fromObject(list);
         System.out.println(listJson);
        //4.把数据响映到前端
        out.println(listJson);
        */


        String  provinceJson=provinceCityServcie.getProvinceJson();
        System.out.println(provinceJson);
        //4.把数据响映到前端
        out.println(provinceJson);

    }
}
