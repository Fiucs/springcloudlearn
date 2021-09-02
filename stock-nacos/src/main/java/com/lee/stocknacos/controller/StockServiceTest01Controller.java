package com.lee.stocknacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 订单服务测试01
 * @author: Ficus
 * @create: 2021-08-23 16:53
 **/

@RestController
@RequestMapping("/stockService")
public class StockServiceTest01Controller {
    static AtomicInteger atomicInteger = new AtomicInteger();
    @Value("${server.port}")
    private String port;
    @RequestMapping("/test01/{id}")
    public String orderTest01(@PathVariable(value = "id") Long id){
        if (atomicInteger.incrementAndGet() % 2==0){
            Integer a=1/0;
        }
        return id+"库存扣减成功1："+port;
    }
    @RequestMapping("/test02/{id}")
    public String orderTest02(@PathVariable(value = "id") Long id) throws InterruptedException {
        return id+"库存扣减成功2："+port;
    }
}
