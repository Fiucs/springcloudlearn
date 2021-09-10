package com.lee.orderopenfegin.feign;

import com.lee.orderopenfegin.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @description: seata_ordere库的order订单
 * @author: Ficus
 * @create: 2021-09-07 15:57
 **/
@Component
@FeignClient(value = "seata-order-test",path = "/seataOrder")
public interface FeignSeataOrderService {

    @RequestMapping("/all")
    public List<Order> selectAll();

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public Integer saveOrder(@RequestBody Order order);
}
