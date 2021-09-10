package com.lee.seataordertest.controller;

import com.lee.seataordertest.entity.Order;
import com.lee.seataordertest.entity.Stock;
import com.lee.seataordertest.mapper.StockMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 库存类
 * @author: Ficus
 * @create: 2021-09-07 15:38
 **/
@RestController
@RequestMapping("/seataStock")
public class StockController {
    @Autowired
    StockMapper stockMapper;

    @RequestMapping("/all")
    public List<Stock> selectAll(){

        return  stockMapper.selectList(null);
    }


    @RequestMapping("/getById/{id}")
    public Stock getById(@PathVariable(value = "id") Integer id ){
//        QueryWrapper<Stock> queryWrapper = new QueryWrapper<>();
        return  stockMapper.selectById(id);
    }

    @RequestMapping(value = "/saveStock",method = RequestMethod.POST)
    public Integer saveStock(@RequestBody Stock stock){
//        QueryWrapper<Stock> queryWrapper = new QueryWrapper<>();
        return stockMapper.insert(stock);
    }
}
