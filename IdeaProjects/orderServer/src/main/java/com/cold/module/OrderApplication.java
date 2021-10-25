package com.cold.module;

import com.cold.module.request.OrderServerRequest;

import java.io.IOException;

/**
 *
 */
public class OrderApplication {

    public static void main(String[] args) throws Exception{
        //把服务发布出去
        OrderServerRequest orderServerRequest=new OrderServerRequest();
        orderServerRequest.publishServer();
    }
            }
