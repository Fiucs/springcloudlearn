package com.lee.orderopenfegin.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.lee.orderopenfegin.entity.R;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 异常公用 注意返回值参数需和controller中相同
 * @author: Ficus
 * @create: 2021-08-31 11:38
 **/
public class ExceptionUtil {
    public static R blockException(Integer id, BlockException e){
        System.out.println("----------------------blockException---------:"+e.getRule());
        if (e instanceof FlowException){
            return R.error(100,id+":被限流了");
        }else if (e instanceof ParamFlowException){
            return R.error(103,"热点参数限流了");
        }

        return  R.error("当前服务不可用");
    }
    public static R blockException2(@PathVariable("id") Long id, BlockException e){
        System.out.println("----------------------blockException---------:"+e.getRule());
        if (e instanceof FlowException){
            return R.error(100,id+":被限流了");
        }else if (e instanceof ParamFlowException){
            return R.error(103,"热点参数限流了");
        }

        return  R.error("当前服务不可用");
    }
}
