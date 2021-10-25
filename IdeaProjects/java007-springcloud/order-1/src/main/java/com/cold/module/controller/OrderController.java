package com.cold.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Map<String,Object> info() throws Exception {
    Map<String,Object> map = new HashMap<String, Object>();
    map.put("server-order","order-1");
    //模拟超时
   Thread.sleep(3000);

        //模拟异常
     /*  if (true){
           throw new Exception();
       }*/
    return map;
    }
}
