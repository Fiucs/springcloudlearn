package com.lee.orderopenfegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderNacosConfigApplication.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String userName = environment.getProperty("user.name");
        System.out.println("userName:"+userName);
        String userAge = environment.getProperty("user.age");
        System.out.println("userAge:"+userAge);
        String userName1 = environment.getProperty("user1.name1");
        String userAge1 = environment.getProperty("user1.age1");
        System.out.println("userName1:"+userName1);
        System.out.println("userAge1:"+userAge1);
        String userName2 = environment.getProperty("user2.name2");
        String userAge2 = environment.getProperty("user2.age2");
        System.out.println("userName2:"+userName2);
        System.out.println("userAge2:"+userAge2);


    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

}
