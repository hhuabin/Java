package com.springioc.dao;

import com.springioc.bean.User;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:17
 */
public interface UserDao {
    public void updateNameById(String name, Integer id);

    public void updateAgeById(Integer age, Integer id);
}
