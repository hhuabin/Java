package com.springioc.service.impl;

import com.springioc.bean.User;
import com.springioc.dao.UserDao;
import com.springioc.service.UserService;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:19
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAllUser() {
        return userDao.getAllUser();
    }
}
