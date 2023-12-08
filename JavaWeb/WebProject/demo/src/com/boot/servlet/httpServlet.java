package com.boot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @author bin
 * @date 2023-12-06 9:47
 */
@WebServlet("/httpservlet")
public class httpServlet extends HttpServlet {

    // http://localhost:5000/demo/httpservlet?username=bin&age=18
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println(req.getMethod());
        System.out.println(req.getScheme());
        System.out.println(req.getProtocol());
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getLocalPort());
        System.out.println(req.getServerPort());
        System.out.println(req.getRemotePort());*/


        // 获取请求头相关的
        /*System.out.println("------------------getHeaderNames--------------------");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String hname = headerNames.nextElement();
            System.out.println(hname + ": " + req.getHeader(hname));
        }
        System.out.println(req.getContentType());*/


        // 用于获取key=value形式的参数
        /*String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println("username: " + username + ", age: " + age);

        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            if(value.length > 1) {
                System.out.println(key + "=" + value.toString());
            } else {
                System.out.println(key + "=" + value[0]);
            }
        }*/


        System.out.println("------------------setHeader--------------------");
        resp.setStatus(200);
        String _html = "<h1>hhaubin</h1>";
        resp.setHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.write(_html);

        // 响应重定向
        /*System.out.println("httpservlet");
        resp.setStatus(302);
        resp.setHeader("location", "hello");*/


    }
}
