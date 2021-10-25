package com.cold;

import org.aspectj.apache.bcel.classfile.ModuleMainClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka01Application01 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application01.class);
    }
}
