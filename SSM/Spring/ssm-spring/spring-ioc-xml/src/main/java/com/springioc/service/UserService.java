package com.springioc.service;

import com.springioc.dao.UserDao;

/**
 * @author bin
 * @date 2023-12-22 15:55
 */
public class UserService {

    private UserDao userDao;

    private String name;

    public UserService() {
    }

    public UserService(UserDao userDao, String name) {
        this.userDao = userDao;
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
