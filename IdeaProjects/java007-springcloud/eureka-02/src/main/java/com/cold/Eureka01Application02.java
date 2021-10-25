package com.cold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka01Application02 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application02.class);
    }
}
