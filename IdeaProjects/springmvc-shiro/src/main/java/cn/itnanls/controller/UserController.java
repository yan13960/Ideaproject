package cn.itnanls.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 *
 */
@RestController
@RequestMapping("user")
public class UserController {
    /*
    @Autowired
    private SecurityManager securityManager;

    @PostConstruct
    private void initStaticSecurityManager() {
        SecurityUtils.setSecurityManager(securityManager);
    }*/

    @RequestMapping("add")
    @RequiresPermissions("document:read")
    public String adminConfig(Model model) {
        /*Subject subject = SecurityUtils.getSubject();
        subject.checkPermission("user:add");*/
        return "redirect:https://www.baidu.com/";
    }


}
