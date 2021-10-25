package com.cold.module.controller;

import com.cold.module.anno.RpcClazz;
import com.cold.module.anno.RpcMethod;

/**
 *
 */
@RpcClazz
public class OrderController {
    @RpcMethod
    public void info(String name){
        System.out.println("order query_" +name);
    }
     @RpcMethod
    public void info2(String name){
        System.out.println("order query_" +name);
    }
}
