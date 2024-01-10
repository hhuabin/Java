package com.springioc.service;

import com.springioc.bean.User;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:18
 */
public interface UserService {

    public void getMessage();

    List<User> findAllUser();
}
