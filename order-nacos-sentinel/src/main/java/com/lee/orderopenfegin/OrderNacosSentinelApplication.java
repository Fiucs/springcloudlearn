package com.lee.orderopenfegin;

import com.alibaba.cloud.sentinel.datasource.RuleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosSentinelApplication.class, args);

    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

}
