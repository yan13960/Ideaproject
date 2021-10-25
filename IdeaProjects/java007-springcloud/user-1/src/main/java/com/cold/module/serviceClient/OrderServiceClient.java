package com.cold.module.serviceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@FeignClient("SERVER-ORDER")
public interface OrderServiceClient {
    @RequestMapping("/order/info")
    Object info();
}
