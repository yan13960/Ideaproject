package com.cold.module.controller;

import com.cold.module.serviceClient.OrderServiceClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final String SERVER_ORDER_URL = "http://SERVER-ORDER";
    @Resource
    OrderServiceClient orderServiceClient;

    @Resource
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @RequestMapping("/info")
    public Object getOrderInfo(){
        return restTemplate.getForObject(SERVER_ORDER_URL+"/order/info",Object.class);
    }


   /* @HystrixCommand(fallbackMethod = "fallbackMethod",
            threadPoolKey = "getOrderInfo2",
            threadPoolProperties = {@HystrixProperty(name = "coreSize",value = "2"),
                    @HystrixProperty(name = "maxQueueSize",value = "1")}
    )*/

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @RequestMapping("/info2")
    public Object getOrderInfo2(){
        return orderServiceClient.info();
    }

    public Map<String,Object> fallbackMethod(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("error","服务器响应超时了，请稍等一会儿...");
        return map;
    }
}
