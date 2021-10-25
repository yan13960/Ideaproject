package com.cold.filter;

import com.cold.enun.LoginResponse;
import com.cold.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Component
@Order(-1)
public class HtmlLoginFilter implements WebFilter {

    @Autowired
    private RedisService redisService;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        MultiValueMap<String, HttpCookie> cookies = request.getCookies();
        LoginResponse loginResponse = LoginResponse.filterUrl(path);
        if (loginResponse != null) {
            for (String s : loginResponse.getSkipUrl()) {
                if (path.equals(s)) {
                    return chain.filter(exchange);
                }
            }
            for (Map.Entry<String, List<HttpCookie>> cookie : cookies.entrySet()) {
                String cookieKey = loginResponse.getCookieKey();
                if (cookieKey.equals(cookie.getKey())) {
                    if (redisService.get(cookie.getValue().get(0).getValue())!=null) {
                        return chain.filter(exchange);
                    }
                }
            }
            ServerHttpResponse response = exchange.getResponse();
            response.getHeaders().set("Location",loginResponse.getResponseUrl());
            response.setStatusCode(HttpStatus.SEE_OTHER);
            return response.setComplete();
        }
        return chain.filter(exchange);
    }
}
