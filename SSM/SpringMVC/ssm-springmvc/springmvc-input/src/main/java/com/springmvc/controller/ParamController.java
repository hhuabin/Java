package com.springmvc.controller;

import com.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author bin
 * @date 2024-02-05 11:43
 */
@Controller
@RequestMapping("param")
public class ParamController {

    @GetMapping("data")
    @ResponseBody
    public String data(String name, int age) {
        System.out.println("name=" + name + " " + "age=" + age);
        return ("name=" + name + " " + "age=" + age);
    }

    @GetMapping("requestParam")
    @ResponseBody
    public String requestParam(@RequestParam("name") String name,
                               @RequestParam(required = false, defaultValue = "18") int age
    ) {
        System.out.println("name=" + name + " " + "age=" + age);
        return ("name=" + name + " " + "age=" + age);
    }

    // http://localhost:5000/param/mulForm?list=bin&list=18
    @GetMapping("mulForm")
    @ResponseBody
    public String mulForm(@RequestParam List<String> list) {
        System.out.println(list.toString());
        return list.toString();
    }

    // http://localhost:5000/param/addUser?name=bin
    @GetMapping (value = "addUser")
    @ResponseBody
    public String addUser(User user) {
        System.out.println("user=" + user.toString());
        return user.toString();
    }

    @ResponseBody
    @GetMapping("/user/{userid}")
    public String testPathVariable(@PathVariable("userid") String userId) {
        System.out.println("userId: " + userId);
        return userId;
    }
}
