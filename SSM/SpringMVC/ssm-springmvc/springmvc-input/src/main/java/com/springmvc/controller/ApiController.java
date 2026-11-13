package com.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2024-02-06 9:15
 */
@Controller
@RequestMapping("api")
@ResponseBody
public class ApiController {

    // 注入全局 ServletContext（应用域对象）
    @Autowired
    private ServletContext servletContext;

    @GetMapping("http")
    public void api(HttpServletRequest request,       // 请求对象（承载请求域）
                    HttpServletResponse response,     // 响应对象
                    HttpSession session               // 会话对象（承载会话域）
    ) {
        // 通过请求对象获取应用域对象
        ServletContext servletContext1 = request.getServletContext();
        // 通过会话对象获取应用域对象
        ServletContext servletContext2 = session.getServletContext();

        System.out.println(servletContext1 == servletContext2);     // 输出 true
        System.out.println(servletContext == servletContext1);      // 输出 true
    }
}
