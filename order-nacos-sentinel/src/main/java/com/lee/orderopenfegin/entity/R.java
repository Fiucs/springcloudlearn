package com.lee.orderopenfegin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 全局异常类
 * @author: Ficus
 * @create: 2021-08-31 11:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private Integer code;
    private String msg;
    public  static R error(Integer code,String msg) {
        return new R(code,msg);
    }
    public  static R error(String msg) {
        return new R(500,msg);
    }
    public  static R ok(String msg) {
        return new R(200,msg);
    }
}
