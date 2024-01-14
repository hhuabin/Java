package com.springioc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author bin
 * @date 2024-01-10 15:39
 */

@ComponentScan("com.springioc")
@PropertySource(value = "classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {

    // druid连接池
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

    // jdbcTemplate
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

}
