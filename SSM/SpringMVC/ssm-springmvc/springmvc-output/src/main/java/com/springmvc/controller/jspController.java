package com.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bin
 * @date 2024-02-20 14:59
 */
@Controller
@RequestMapping("jsp")
public class jspController {

    /**
     * @description 快速查找视图
     *  1. 方法返回字符串类型
     *  2. 不能添加 @ResponseBody 注解
     *  3. 返回值：对应视图名称即可
     */
    @RequestMapping("/index")
    public String jumpJsp(HttpServletRequest request) {
        // 往前端视图注入数据
        request.setAttribute("data", "hello jsp!!!");

        System.out.println("JspController");

        return "index";
    }

    /**
     * 转发：只能是项目下的资源
     *  1. 方法的返回值写成字符串
     *  2. 不能添加 @ResponseBody 注解
     *  3. 返回的字符串前 forward:/转发地址
     */
    @RequestMapping("/forward")
    public String forward() {
        // 转发到 /jsp/index，地址栏是/forward
        return "forward:/jsp/index";
    }

    /**
     * 重定向：可以是项目外的资源
     *  1. 方法的返回值写成字符串
     *  2. 不能添加 @ResponseBody 注解
     *  3. 返回的字符串前 redirect:/转发地址
     */
    @RequestMapping("/redirect")
    public String redirect() {
        // 重定向到 /jsp/index。地址栏是 /index
        return "redirect:/jsp/index";
    }

    @RequestMapping("/redirectBilibli")
    public String redirectBilibli() {
        // 重定向到 /jsp/index
        return "redirect:https://www.bilibili.com";
    }
}
