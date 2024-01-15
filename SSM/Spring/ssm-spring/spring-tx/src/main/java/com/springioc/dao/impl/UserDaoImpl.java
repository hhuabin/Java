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


    @Override
    public void updateNameById(String name, Integer id) {
        String sql = "UPDATE ssm_user SET username = ? WHERE id = ?";
        int rows = jdbcTemplate.update(sql, name, id);
    }

    @Override
    public void updateAgeById(Integer age, Integer id) {
        String sql = "UPDATE ssm_user SET age = ? WHERE id = ?";
        int rows = jdbcTemplate.update(sql, age, id);
    }
}
