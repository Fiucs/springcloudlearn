package com.lee.seataordertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lee.mapper")
public class SeataOrderTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderTestApplication.class, args);
    }

}
