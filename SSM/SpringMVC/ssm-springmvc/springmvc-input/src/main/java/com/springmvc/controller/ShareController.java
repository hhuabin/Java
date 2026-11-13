package com.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author bin
 * @date 2024-02-06 10:15
 */
@Controller
@RequestMapping("share")
@ResponseBody
public class ShareController {

    // 应用域对象
    @Autowired
    private ServletContext servletContext;

    @GetMapping("request")
    public void request(HttpServletRequest request, HttpSession session) {
        // request 就是请求域啦
    }

    // Model 往请求域放数据
    public void request(Model model) {
        model.addAttribute("key", "value");
    }

    // ModelMap 往请求域放数据
    public void request(ModelMap modelMap) {
        modelMap.addAttribute("key", "value");
    }

    // Map 往请求域放数据
    public void request(Map map) {
        map.put("key", "value");
    }

    // ModelAndView 往请求域放数据
    public ModelAndView request() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("key", "value");
        modelAndView.setViewName("视图 / 页面名称");
        return modelAndView;
    }
}
