package com.lee.orderopenfegin.exceptionhandler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.fastjson.JSON;
import com.lee.orderopenfegin.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 全局流控，降级异常捕获
 * @author: Ficus
 * @create: 2021-08-31 11:08
 **/
@Slf4j
@Component
public class MyBlockExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        log.info("-------------------now --------------------block exception------------:"+e.getRule());
        R r=null;
        if (e instanceof FlowException){
            r=R.error(100,"接口限流了");
        }else if (e instanceof ParamFlowException){
            r=R.error(300,"热点参数限流了");
        }

        httpServletResponse.setStatus(500);
        httpServletResponse.setCharacterEncoding("utf8");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.getWriter().write(JSON.toJSONString(r));

    }
}
