package com.cold.controller;

import com.cold.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *RestController responseBody+controller组合注解
 */
@Controller
@RequestMapping("/user")
public class HelloController {
    @Resource
    UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "/aaa.html";
    }

    @RequestMapping("/list")
    public @ResponseBody Map<String,Object> list(@Param("id") String id){
        Logger logger=  LoggerFactory.getLogger(HelloController.class);
        logger.info("xxxx用户访问接口");
        System.out.println(id);
        Map<String,Object>map=new HashMap<>();
        List<Map<String ,Object>> list=userService.list();
        map.put("data",list);
        map.put("code",0);
        map.put("msg","操作成功");
        return map;
    }

    @RequestMapping("/msg")
    public String msg(HttpServletRequest request){
        request.setAttribute("msg","hello world!!!");
        return "/hello";
    }
}
