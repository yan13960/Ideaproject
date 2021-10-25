package com.cold.serviceClient;

import com.cold.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SERVICE-ADMIN")
public interface AdminServiceClient {

    @RequestMapping("/admin/login")
    public R login(@RequestParam("adminName") String name, @RequestParam("adminPassword") String password);

}
