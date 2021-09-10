package com.lee.orderopenfegin.entity;


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
public class Stock implements Serializable {
    private Integer id;
    private Integer productId;
    private Integer count;
}
