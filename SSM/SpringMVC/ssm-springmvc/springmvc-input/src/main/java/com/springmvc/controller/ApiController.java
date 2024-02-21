package com.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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

    @GetMapping("http")
    public void api(HttpServletRequest request,
                    HttpServletResponse response,
                    HttpSession session
    ) {
        ServletContext servletContext = request.getServletContext();
        ServletContext servletContext1 = session.getServletContext();
        System.out.println(servletContext == servletContext1);
    }
}
