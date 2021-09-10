package com.lee.orderopenfegin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lee.orderopenfegin.entity.Order;
import com.lee.orderopenfegin.entity.R;
import com.lee.orderopenfegin.exception.ExceptionUtil;
import com.lee.orderopenfegin.feign.FeignSeataOrderService;
import com.lee.orderopenfegin.feign.FeignSeataStockService;
import com.lee.orderopenfegin.feign.FeignStockService;
import com.lee.orderopenfegin.service.OrderService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description: 订单服务测试01
 * @author: Ficus
 * @create: 2021-08-23 16:53
 **/

@RestController
@RequestMapping("/seataOrder")
public class SeataOrderServiceTest01Controller {
    @Value("${server.port}")
    private String port;
//    @Value("${spring.cloud.nacos.discovery.metadata}")
    private String metadata;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    FeignStockService feignStockService;
    @Autowired
    FeignSeataOrderService feignSeataOrderService;
    @Autowired
    FeignSeataStockService feignSeataStockService;
    @Autowired
    OrderService orderService;
//    @SentinelResource(value ="test04",blockHandlerClass = ExceptionUtil.class,blockHandler = "blockException")
//    @RequestMapping("/test04/{id}")
//    public String orderTest04(@PathVariable(value = "id") Long id) throws InterruptedException {
////        Thread.sleep(5000);
//        String s = feignStockService.orderTest01(id);
//        return "test04下单成功:"+port+s;
//    }
    @RequestMapping("/all")
    public R selectAll(){
        List<Order> orderList = feignSeataOrderService.selectAll();
        return  R.ok("查询成功",orderList);
    }

    @RequestMapping("/saveOrder")
    public R saveOrder(@RequestBody Order order){
        R r = orderService.saveOrder();
        return r;
    }


}
