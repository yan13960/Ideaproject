package com.cold.modules.admin.controller;


import com.cold.annotation.Pmap;
import com.cold.modules.admin.entity.AdminEntity;
import com.cold.modules.admin.service.IAdminService;
import com.cold.util.P;
import com.cold.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    IAdminService adminService;

    @RequestMapping("/login")
    public Object login(@Pmap P p){
        AdminEntity adminEntity = adminService.check(p);
        if (adminEntity == null) {
            return R.error("用户名错误或者用户不存在！");
        }
        if (!adminEntity.getAdminPassword().equals(p.getString("adminPassword"))) {
            return R.error("密码错误！");
        }
        return R.success("登陆成功！").data(adminEntity);
    }

}
