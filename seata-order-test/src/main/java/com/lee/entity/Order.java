package com.lee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 订单类
 * @author: Ficus
 * @create: 2021-09-03 17:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
//    商品id
    private Integer productId;
    private Integer totalAmount;
    private Integer status;


}
