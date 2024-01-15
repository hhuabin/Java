package com.springioc.controller;

import com.springioc.bean.User;
import com.springioc.service.UserService;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:18
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void findAll() {
        List<User> allUser = userService.findAllUser();
        System.out.println(allUser);
    }
}
