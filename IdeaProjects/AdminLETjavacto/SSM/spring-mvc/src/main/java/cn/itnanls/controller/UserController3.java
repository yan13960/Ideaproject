package cn.itnanls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringMVC整个的执行流程
 * 1.发起请求到前端控制器（DispatcherServlet）
 * 2.前端控制器请求HandlerMapping查找Handler（一般是要执行的拦截器和处理器）（根据注解，xml进行查找）
 * 3.处理映射器HandlerMapping向前端控制器DispatcherServlet返回handler
 * 4.前端控制器调用处理适配器HandlerAdapter找到合适的处理器Handler执行handler
 * 5.处理器执行handler
 * 6.处理器Handler执行完之后给处理器适配器返回ModelAndView
 * 7.处理适配器向前端控制器返回ModelAndView
 * 8.前端控制器请求视图解析器去解析视图（jsp）
 * 9.视图解析器向前端控制器返回view
 * 10.前端控制器进行视图渲染
 * 11.前端控制器向用户响应结果
 */
@Controller
@RequestMapping("user3")
public class UserController3 {

    @RequestMapping("/showUser3")
    public String showUser(Model model)  {
        model.addAttribute("user","hello lucy");
        return "user";
    }

    @RequestMapping("/addUser3")
    public String addUser(Model model,HttpServletRequest request,HttpServletResponse response)  {
        System.out.println(request.getServerPort());
        model.addAttribute("user","hello lucyAdd");
        return "user";
    }
}
