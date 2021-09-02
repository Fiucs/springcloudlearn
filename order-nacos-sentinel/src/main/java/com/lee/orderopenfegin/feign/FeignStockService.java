package com.lee.orderopenfegin.feign;

import com.lee.orderopenfegin.feign.fallback.ConsumerFallbackCommonService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 远程调用仓库
 * @author: Ficus
 * @create: 2021-08-31 15:36
 **/
@Component
@FeignClient(value = "stock-service",path = "/stockService",fallback = ConsumerFallbackCommonService.class)
public interface FeignStockService {

    @RequestMapping("/test01/{id}")
    public String orderTest01(@PathVariable(value = "id") Long id );
    @RequestMapping("/test02/{id}")
    public String orderTest02(@PathVariable(value = "id") Long id );
}
