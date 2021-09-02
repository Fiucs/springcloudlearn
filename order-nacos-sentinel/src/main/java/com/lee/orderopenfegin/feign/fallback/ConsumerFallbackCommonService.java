package com.lee.orderopenfegin.feign.fallback;

import com.alibaba.fastjson.JSON;
import com.lee.orderopenfegin.entity.R;
import com.lee.orderopenfegin.feign.FeignStockService;
import org.springframework.stereotype.Component;

/**
 * @description: 通用降级服务
 * @author: Ficus
 * @create: 2021-08-31 15:41
 **/
@Component
public class ConsumerFallbackCommonService implements FeignStockService {

    @Override
    public String orderTest01(Long id) {
        return JSON.toJSONString( R.error(200,id+":服务熔断，调用客户端本地方法"));
    }

    @Override
    public String orderTest02(Long id) {
        return JSON.toJSONString( R.error(200,id+":服务熔断，调用客户端本地方法"));
    }
}
