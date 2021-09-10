package com.lee.seataordertest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 订单类
 * @author: Ficus
 * @create: 2021-09-03 17:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("order_tbl")
public class Order implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
//    商品id
    private Integer productId;
    private Integer totalAmount;
    private Integer status;


}
