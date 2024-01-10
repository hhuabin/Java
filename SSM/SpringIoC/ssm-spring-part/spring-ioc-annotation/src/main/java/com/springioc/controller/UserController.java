package com.springioc.controller;

import com.springioc.bean.User;
import com.springioc.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-01 0:18
 */
@Controller
public class UserController {

    @Resource
    // @Autowired
    // @Qualifier(value = "userServiceImpl")
    private UserService userService;

    public void getMessage() {
        userService.getMessage();
    }

    public void findAll() {
        List<User> allUser = userService.findAllUser();
        System.out.println(allUser);
    }
}
