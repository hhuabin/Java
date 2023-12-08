package com.boot.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author bin
 * @date 2023-12-07 20:08
 */
@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String request = (String)req.getAttribute("request");
        System.out.println("请求域" + request);

        HttpSession session = req.getSession();
        String sessionMessage = (String)session.getAttribute("session");
        System.out.println("会话域" + sessionMessage);

        ServletContext servletContext = req.getServletContext();
        String applicationMessage = (String)servletContext.getAttribute("application");
        System.out.println("应用域" + applicationMessage);

    }
}
