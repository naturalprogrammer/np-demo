package com.naturalprogrammer.spring.mvcinterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private RequestLogger requestLogger;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(requestLogger);
    }
}
