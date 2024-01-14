package com.springioc.dao.impl;

import com.springioc.bean.User;
import com.springioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:19
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getMessage() {
        System.out.print("I am a soldier");
    }

    @Override
    public List<User> getAllUser() {
        String sql = "SELECT * FROM ssm_user";

        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

        return userList;
    }
}
