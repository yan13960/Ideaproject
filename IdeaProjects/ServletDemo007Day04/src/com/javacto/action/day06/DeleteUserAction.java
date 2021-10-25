package com.javacto.action.day06;

import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;

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
@WebServlet("/deleteUser")
public class DeleteUserAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响映编码格式
        resp.setContentType("text/html;charset=UTF-8");
        //1.获取jsp传递 过来的值
        String strId=req.getParameter("id");
        Integer id = Integer.parseInt(strId);// 转为int类型

        String userName = req.getParameter("userName");

        //2.创建业务层代码
        UserService userService = new UserServiceImpl();

        //3.调用业务层代码
        int num = userService.deleteUser(id);

        //4.再跳转到查询user 控制层
        req.getRequestDispatcher("/queryUserAll.do").forward(req,resp);

    }
}
