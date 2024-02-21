package com.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bin
 * @date 2024-02-21 14:20
 */
@RestController
public class UserController {

    @GetMapping("arithmetic")
    public String ArithmeticExceptionController() {
        int i = 1 / 0;
        return "ok";
    }

    @GetMapping("exception")
    public String exception() {
        String name = null;
        name.toString();
        return "ok";
    }
}
