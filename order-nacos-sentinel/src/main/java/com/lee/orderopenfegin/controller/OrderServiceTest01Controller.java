package com.lee.orderopenfegin.controller;

import com.alibaba.cloud.sentinel.datasource.RuleType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lee.orderopenfegin.entity.R;
import com.lee.orderopenfegin.exception.ExceptionUtil;
import com.lee.orderopenfegin.feign.FeignStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 订单服务测试01
 * @author: Ficus
 * @create: 2021-08-23 16:53
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
    @Autowired
    FeignStockService feignStockService;
    @RequestMapping("/test01")
    public String orderTest01(){
        System.out.println(metadata);
        String res = restTemplate.getForObject("http://stock-service/stockService/test01", String.class);
        return "下单成功:"+port+res;
    }
    @SentinelResource(value ="test02" )
    @RequestMapping("/test02")
    public String orderTest02() throws InterruptedException {
//        Thread.sleep(5000);
        return "test02下单成功:"+port;
    }
    @SentinelResource(value ="test03",blockHandlerClass = ExceptionUtil.class,blockHandler = "blockException2")
    @RequestMapping("/test03/{id}")
    public R orderTest03(@PathVariable(value = "id") Long id)  {
//        Thread.sleep(5000);
        String s = "test03下单成功:" + port;
        return R.ok(s);
    }
    @SentinelResource(value ="test04",blockHandlerClass = ExceptionUtil.class,blockHandler = "blockException")
    @RequestMapping("/test04/{id}")
    public String orderTest04(@PathVariable(value = "id") Long id) throws InterruptedException {
//        Thread.sleep(5000);
        String s = feignStockService.orderTest01(id);
        return "test04下单成功:"+port+s;
    }



}
