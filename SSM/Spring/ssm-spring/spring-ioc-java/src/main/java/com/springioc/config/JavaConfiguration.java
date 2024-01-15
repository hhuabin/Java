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

/**
 * 1.扫描包
 * 2.引用外部配置文件
 * 3.声明第三方依赖的Bean组件
 */
@ComponentScan({"com.springioc.controller", "com.springioc.service"})
@PropertySource(value = "classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {

    @Value("${jdbc.user}")
    private String user;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String url;

    // 默认使用driver值
    @Value("${jdbc.driver}")
    private String driver;

    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean(name = "dataSource", initMethod = "", destroyMethod = "")
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }

    public JdbcTemplate jdbcTemplate1() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    public JdbcTemplate jdbcTemplate2(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
