package com.springioc;

import com.springioc.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author bin
 * @date 2022-12-17-22:21
 */
public class JdbcTemplateTest {

    @Test
    public void testGetAllUser(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-jdbc.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String sql = "SELECT * FROM ssm_user";

        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

        System.out.println("userList = " + userList);

        // 插入操作
        String insertSql = "insert into ssm_user values(null, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(insertSql, "root", "123", 24, "男", "77777@qq.com");
    }

}
