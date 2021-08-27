package com.lee.stocknacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 订单服务测试01
 * @author: Ficus
 * @create: 2021-08-23 16:53
 **/

@RestController
@RequestMapping("/stockService")
public class StockServiceTest01Controller {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/test01/{id}")
    public String orderTest01(@PathVariable(value = "id") Long id){
        return id+"库存扣减成功1："+port;
    }
    @RequestMapping("/test02/{id}")
    public String orderTest02(@PathVariable(value = "id") Long id) throws InterruptedException {
        Thread.sleep(2100);
        return id+"库存扣减成功2："+port;
    }
}
