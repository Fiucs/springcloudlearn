package com.lee.ordernacosopenfeign.controller;

import com.lee.ordernacosopenfeign.feign.OrderFeignService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @description: 测试接口
 * @author: Ficus
 * @create: 2021-08-25 14:32
 **/
@RestController
@RequestMapping("/orderService")
public class OrderTestController {
    @Autowired
    OrderFeignService orderFeignService;
    @Value("${server.port}")
    String port;
    @RequestMapping("/test01/{id}")
    public String orderTest01(@PathVariable(value = "id")Long id){
        String res = orderFeignService.orderTest01(id);
        return "下单成功:"+port+" "+res;
    }

    @RequestMapping("/test02/{id}")
    public String orderTest02(@PathVariable(value = "id")Long id){
        String res = orderFeignService.orderTest02(id);
        return "下单成功:"+port+" "+res;
    }
}
