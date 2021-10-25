package com.cold.config;

import com.cold.annotation.Pmap;
import com.cold.resolvers.PmapResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(pmapResolver());
        super.addArgumentResolvers(argumentResolvers);
    }

    @Bean
    public PmapResolver pmapResolver(){
        return new PmapResolver();
    }

}
