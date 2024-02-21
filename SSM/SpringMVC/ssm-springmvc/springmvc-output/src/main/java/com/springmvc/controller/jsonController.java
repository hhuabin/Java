package com.springmvc.controller;

import com.springmvc.bean.Person;
import com.springmvc.bean.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bin
 * @date 2024-02-20 16:34
 */
@RequestMapping("json")
@RestController // = @Controller + @ResponseBody
public class jsonController {

    @GetMapping(value  = "user")
    public User getUser() {
        User user = new User();
        user.setAge(18);
        user.setName("bin");
        System.out.println("user: " + user.toString());
        return user;
    }
}
