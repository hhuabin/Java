package com.springioc.service.impl;

import com.springioc.bean.User;
import com.springioc.dao.UserDao;
import com.springioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void getMessage() {
        userDao.getMessage();
    }

    @Override
    public List<User> findAllUser() {
        return userDao.getAllUser();
    }
}
