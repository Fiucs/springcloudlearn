package com.lee.orderserviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 测试
 * @author: Ficus
 * @create: 2021-08-24 16:08
 **/
@RestController
@RequestMapping("/orderService")

public class OrderServiceTest01Controller {
    @Value("${server.port}")
    private String port;
    //    @Value("${spring.cloud.nacos.discovery.metadata}")
    private String metadata;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/test01")
    public String orderTest01(){
        System.out.println(metadata);
        String res = restTemplate.getForObject("http://stock-service/stockService/test01", String.class);
        return "下单成功:"+port+res;
    }
}
