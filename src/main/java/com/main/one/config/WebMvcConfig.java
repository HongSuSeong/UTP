package com.main.one.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.main.one.interceptor.BoardInterceptor;
 
@ComponentScan(basePackages = { "com.api.board.controller" }, useDefaultFilters = false, includeFilters = { @Filter(Controller.class) })
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
 
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BoardInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/sample/**");
    }
}
