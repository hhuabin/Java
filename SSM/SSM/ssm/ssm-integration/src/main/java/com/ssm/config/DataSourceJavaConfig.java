package com.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author bin
 * @date 2024-02-22 11:13
 */
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class DataSourceJavaConfig {

    @Bean
    public DruidDataSource dataSource(
            @Value("${jdbc.user}") String user,
            @Value("${jdbc.password}") String password,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.driver}") String driver
    ) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }
}
