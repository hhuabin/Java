package com.boot.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author bin
 * @date 2023-12-07 15:48
 */
@WebServlet(value = "/session", name = "session")
public class Session extends HttpServlet {
    // http://localhost:5000/demo/session
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*System.out.println("-------------Cookie----------------");
        Cookie cookie = new Cookie("token", "hhuabin");
        // 设置 Cookie 的路径和过期时间
        cookie.setPath("/");
        // cookie.setMaxAge(3600); // 1 小时后过期
        // 将 Cookie 添加到响应中
        resp.addCookie(cookie);

        // 从请求中获取 Cookie
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                System.out.println("Cookie Name: " + c.getName() + ", Value: " + c.getValue());
            }
        }*/


        /*System.out.println("-------------Session----------------");

        // 获取 HttpSession 对象
        HttpSession session = req.getSession();

        // 向会话中添加属性
        session.setAttribute("username", "JohnDoe");

        // 从会话中获取属性
        String username = (String) session.getAttribute("username");

        // 设置最大非活动时间为 30 分钟
        session.setMaxInactiveInterval(1800);

        System.out.println(session.getId() + "---" + username);
        System.out.println(session.isNew());*/


        // 向请求域中放入数据
        req.setAttribute("request", "requestMessage");

        // 向会话域中放入数据
        HttpSession session = req.getSession();
        session.setAttribute("session", "sessionMessage");

        // 向应用域中放入数据
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("application", "applicationMessage");

        // RequestDispatcher requestDispatcher = req.getRequestDispatcher("/session2");
        // requestDispatcher.forward(req, resp);
    }
}
