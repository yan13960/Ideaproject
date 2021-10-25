package com.cold.controller;

import com.cold.param.RedisParamenter;
import com.cold.redis.service.RedisService;
import com.cold.serviceClient.AdminServiceClient;
import com.cold.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    AdminServiceClient adminServiceClient;

    @Autowired
    RedisService redisService;

    @RequestMapping("/admin")
    public R adminLogin(String adminName, String adminPassword, ServerHttpResponse response){
        R login = adminServiceClient.login(adminName, adminPassword);
        int code = Integer.parseInt(login.get("code").toString());
        if (code == 0) {
            Map data = (Map) login.get("data");
            String id = UUID.randomUUID().toString().replaceAll("-", "");
            redisService.set(id,data);
            ResponseCookie build = ResponseCookie.from(RedisParamenter.ADMIN_LOING_USER_REDIS_KEY, id).path("/").build();
            response.addCookie(build);
        }
        return adminServiceClient.login(adminName,adminPassword);
    }

}
