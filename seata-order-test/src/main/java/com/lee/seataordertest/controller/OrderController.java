package com.lee.seataordertest.controller;

import com.lee.seataordertest.entity.Order;
import com.lee.seataordertest.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 订单接口
 * @author: Ficus
 * @create: 2021-09-07 15:33
 **/
@RestController
@RequestMapping("/seataOrder")
public class OrderController {
    @Autowired
    OrderMapper orderMapper;
    @RequestMapping("/all")
    public List<Order> selectAll(){
       return orderMapper.selectList(null);
    }

    @RequestMapping("/getById/{id}")
    public Order getById(@PathVariable(value = "id") Integer id ){
//        QueryWrapper<Stock> queryWrapper = new QueryWrapper<>();
        return  orderMapper.selectById(id);
    }

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public Integer saveOrder(@RequestBody Order order){
//        QueryWrapper<Stock> queryWrapper = new QueryWrapper<>();
        int insert = orderMapper.insert(order);
//        int i=1/0;
        return insert;
    }


}
