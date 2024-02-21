package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bin
 * @date 2024-02-20 14:59
 */
@Controller
@RequestMapping("jsp")
public class jspController {

    @RequestMapping("/index")
    public String jumpJsp() {

        return "index";
    }

    @RequestMapping("/forward")
    public String forward() {
        // 转发到 /jsp/index，地址栏是/forward
        return "forward:/jsp/index";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        // 重定向到 /jsp/index。地址栏是/index
        return "redirect:/jsp/index";
    }

    @RequestMapping("/redirectBilibli")
    public String redirectBilibli() {
        // 重定向到 /jsp/index
        return "redirect:https://www.bilibili.com";
    }
}
