package com.lee.ordernacosopenfeign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @description: feign的拦截器
 * @author: Ficus
 * @create: 2021-08-25 17:30
 **/
public class FeignAuthRequestInterceptor implements RequestInterceptor {
//    实现拦截方法
    @Override
    public void apply(RequestTemplate template) {
        System.out.println("拦截器拦截了");
        String url = template.url();
        System.out.println("url:"+url);
    }
}
