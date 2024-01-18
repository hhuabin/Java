package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2024-01-18 15:13
 */
@Controller
public class HelloController {

    // http://localhost:5000/springmvc/hello
    @RequestMapping("springmvc/hello")
    @ResponseBody
    public String hello() {
        System.out.println("Hello Controller");
        return "hello springmvc";
    }
}
