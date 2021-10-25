package com.cold.modules.menu.controller;


import com.cold.modules.menu.service.IMenuService;
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
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @RequestMapping("/list")
    public R list(){
        return menuService.getMenu();
    }

}
