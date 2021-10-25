package cn.itnanls.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class LoginController {
    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        @RequestParam Boolean rememberMe){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        token.setRememberMe(rememberMe);
        try {
            subject.login(token);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
