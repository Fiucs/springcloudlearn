package com.lee.ordernacosopenfeign.config;

import com.lee.ordernacosopenfeign.interceptor.FeignAuthRequestInterceptor;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: feign的日志配置类
 * @author: Ficus
 * @create: 2021-08-25 16:52
 **/
//加此注解 则会全局生效 （对调用的所有服务器接口都会生效）
//@Configuration
public class FeignLogConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    @Bean
    public FeignAuthRequestInterceptor feignAuthRequestInterceptor(){
        return new FeignAuthRequestInterceptor();
    }
}
