package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2023-06-05-10:33
 */
@RequestMapping("/request")
@Controller
public class test {

    @ResponseBody
    @GetMapping("/test")
    public String niHao() {
        return "test";
    }
}
