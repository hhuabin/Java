package com.springioc.controller;

import com.springioc.bean.User;
import com.springioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:18
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void findAll() {

    }
}
