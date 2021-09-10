package com.lee.orderopenfegin.feign;

import com.lee.orderopenfegin.entity.Order;
import com.lee.orderopenfegin.entity.Stock;
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
@FeignClient(value = "seata-stock-test",path = "/seataStock")
public interface FeignSeataStockService {

    @RequestMapping("/all")
    public List<Stock> selectAll();
    @RequestMapping(value = "/saveStock",method = RequestMethod.POST)
    public Integer saveStock(@RequestBody Stock stock);
}
