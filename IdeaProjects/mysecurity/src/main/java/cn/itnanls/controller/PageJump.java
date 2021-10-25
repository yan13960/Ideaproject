package cn.itnanls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 *
 */
@Controller
public class PageJump {

    @RequestMapping({"/","/index"})
    public String toIndex(HttpSession session){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toUser")
    public String toUser(){
        return "user";
    }
}
