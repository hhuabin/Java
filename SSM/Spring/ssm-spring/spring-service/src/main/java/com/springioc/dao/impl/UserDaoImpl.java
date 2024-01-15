package com.springioc.dao.impl;

import com.springioc.bean.User;
import com.springioc.dao.UserDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:19
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getAllUser() {
        String sql = "SELECT * FROM ssm_user";

        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

        return userList;
    }
}
