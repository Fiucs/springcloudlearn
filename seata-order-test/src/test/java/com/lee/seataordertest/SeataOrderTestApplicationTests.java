package com.lee.seataordertest;

import com.alibaba.fastjson.JSON;
import com.lee.entity.Order;
import com.lee.mapper.OrderMapper;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class SeataOrderTestApplicationTests {

    @Autowired
    OrderMapper orderMapper;
    @Test
    void contextLoads() {
        List<Order> orders = orderMapper.selectList(null);

        String s = JSON.toJSONString(orders);
        System.out.println(s);

    }

}
