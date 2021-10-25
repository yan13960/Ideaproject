package com.cold.module.controller;

import com.cold.module.anno.RpcClazz;
import com.cold.module.anno.RpcMethod;

/**
 *
 */
@RpcClazz
public class PayController {

    public void pay(){
        System.out.println("pay query_");
    }
@RpcMethod
    public void pay2(){
        System.out.println("pay query_");
    }
}
