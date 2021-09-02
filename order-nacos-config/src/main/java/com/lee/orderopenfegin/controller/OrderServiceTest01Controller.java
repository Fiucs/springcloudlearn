package com.lee.orderopenfegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 订单服务测试01
 * @author: Ficus
 * @create: 2021-08-23 16:53
 **/

@RestController
@RequestMapping("/orderConfigService")
@RefreshScope
public class OrderServiceTest01Controller {
    @Value("${server.port}")
    private String port;
//    @Value("${spring.cloud.nacos.discovery.metadata}")
    private String metadata;
    @Value("${user2.name2}")
    private String userName2;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/test01")
    public String orderTest01(){
        System.out.println(metadata);
        String res = restTemplate.getForObject("http://stock-service/stockService/test01", String.class);
        return "下单成功:"+port+res;
    }

    @RequestMapping("/test02")
    public String orderTest02(){
        System.out.println("/test02:userName2"+userName2);
        return userName2+":下单成功:"+port;
    }
}
