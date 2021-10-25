package com.cold.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @RequestMapping("/info")
    public Map<String,Object> info(){
    Map<String,Object> map = new HashMap<String, Object>();
    map.put("server-order","order-2");
    return map;
    }
}
