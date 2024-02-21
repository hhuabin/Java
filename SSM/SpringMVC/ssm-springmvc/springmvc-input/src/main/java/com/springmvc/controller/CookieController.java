package com.springmvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author bin
 * @date 2024-02-05 17:18
 */
@Controller
@RequestMapping("cookie")
@ResponseBody
public class CookieController {

    @GetMapping("data")
    public String data(@CookieValue("username") String username) {
        System.out.println("username=" + username);
        return username;
    }

    @GetMapping("save")
    public String saveCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("username", "bin");
        response.addCookie(cookie);
        return "success";
    }

    @GetMapping("header")
    public String header(@RequestHeader("Host") String host) {
        System.out.println("host=" + host);
        return host;
    }
}
