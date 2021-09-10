package com.lee.orderopenfegin.entity;

import com.alibaba.fastjson.JSON;
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
    private Object res;
    public  static R error(Integer code,String msg) {
        return new R(code,msg,null);
    }
    public  static R error(String msg) {
        return new R(500,msg,null);
    }
    public  static R ok(String msg) {
        return ok(msg,null);
    }
    public  static R ok(String msg,Object res) {
        return new R(200,msg, res);
    }
}
