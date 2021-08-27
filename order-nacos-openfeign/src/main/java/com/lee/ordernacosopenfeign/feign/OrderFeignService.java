package com.lee.ordernacosopenfeign.feign;

import com.lee.ordernacosopenfeign.config.FeignLogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: openfeign测试接口
 * @author: Ficus
 * @create: 2021-08-25 14:23
 **/
//value 服务端的名称
@FeignClient(value ="stock-service",path = "/stockService")
//指定使用的日志配置类
//@FeignClient(value ="stock-service",path = "/stockService",configuration = {FeignLogConfig.class
//})
public interface OrderFeignService {
    @RequestMapping("/test01/{id}")
    public String orderTest01(@PathVariable(value = "id") Long id );
    @RequestMapping("/test02/{id}")
    public String orderTest02(@PathVariable(value = "id") Long id );
}


//
//@RestController
//@RequestMapping("/stockService")
//public class StockServiceTest01Controller {
//    @Value("${server.port}")
//    private String port;
//    @RequestMapping("/test01")
//    public String orderTest01(){
//        return "库存扣减成功："+port;
//    }
//}
