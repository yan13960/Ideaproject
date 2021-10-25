package com.cold.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 */
@EnableEurekaClient
@SpringBootApplication

public class OrderApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication02.class,args);
    }
}
