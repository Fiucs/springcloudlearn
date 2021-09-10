package com.lee.seataordertest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 库存类
 * @author: Ficus
 * @create: 2021-09-07 15:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "stock_tbl")
public class Stock implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer productId;
    private Integer count;
}
