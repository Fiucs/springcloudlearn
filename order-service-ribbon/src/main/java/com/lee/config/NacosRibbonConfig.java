package com.lee.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: nacos负载均衡
 * @author: Ficus
 * @create: 2021-08-24 16:06
 **/
@Configuration
public class NacosRibbonConfig {
    @Bean
    public IRule iRule(){
        //设置负载均衡
        return new NacosRule();
    }
}
