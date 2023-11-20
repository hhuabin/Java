package com.boot.controller;

import com.boot.bean.User;
import com.boot.controller.utils.R;
import com.boot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author bin
 * @date 2023-02-08-15:58
 */
@Slf4j                // 引入打印日志的包
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/searchbyid")
    public User getUserById(@RequestParam("id") Integer id) {
        User user = userService.getUserById(id);
        System.out.println(user);
        return user;
    }

}
