package com.springioc.service.impl;

import com.springioc.bean.User;
import com.springioc.dao.UserDao;
import com.springioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(
            isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRES_NEW
    )
    public void updateUser() {
        userDao.updateNameById("hhhhhuabin", 3);

        System.out.println("-----------------");

        userDao.updateAgeById(24, 100);
    }

}
