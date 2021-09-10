package com.lee.seataordertest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description: 数据源配置
 * @author: Ficus
 * @create: 2021-09-03 17:43
 **/
@Configuration
public class DatasourceConfig {

        @Bean
        @ConfigurationProperties(prefix = "spring.datasource")
        public DataSource druidDataSource() {
            DruidDataSource druidDataSource = new DruidDataSource();
            return druidDataSource;
        }

}
