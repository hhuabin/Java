package com.springioc.dao;

import com.springioc.bean.User;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:17
 */
public interface UserDao {
    void getMessage();

    List<User> getAllUser();
}
