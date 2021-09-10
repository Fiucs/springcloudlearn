package com.lee.orderopenfegin.service.impl;

import com.lee.orderopenfegin.entity.Order;
import com.lee.orderopenfegin.entity.R;
import com.lee.orderopenfegin.entity.Stock;
import com.lee.orderopenfegin.feign.FeignSeataOrderService;
import com.lee.orderopenfegin.feign.FeignSeataStockService;
import com.lee.orderopenfegin.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: orderservice
 * @author: Ficus
 * @create: 2021-09-07 16:46
 **/

@Service

public class OrderServiceImpl implements OrderService {

    @Autowired
    FeignSeataOrderService feignSeataOrderService;
    @Autowired
    FeignSeataStockService feignSeataStockService;

    @GlobalTransactional(name = "saveOrder")
    @Override
    public R saveOrder() {
        Order order = new Order();
        order.setStatus(20);
        int productId = Integer.parseInt(String.valueOf(Math.round( Math.random()))) * 100;
        order.setProductId(productId);
        order.setTotalAmount(250);
        //新增order
        feignSeataOrderService.saveOrder(order);
        //新增stock
        Stock stock = new Stock();
        stock.setCount(100);
        stock.setProductId(productId);
        stock.setCount(200);
        feignSeataStockService.saveStock(stock);
        return R.ok("新增成功");
    }
}
