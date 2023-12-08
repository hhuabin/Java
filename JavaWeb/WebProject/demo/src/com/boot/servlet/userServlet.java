package com.boot.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author bin
 * @date 2023-11-23-9:32
 */
@WebServlet(
        urlPatterns = "/hello",
        initParams = {
                @WebInitParam(name = "name", value = "bin"),
                @WebInitParam(name = "age", value = "18"),
        }
)
public class userServlet extends HttpServlet {

    // http://localhost:5000/demo/servlet?username=bin
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // System.out.println("请求进来了");

        System.out.println("---------------ServletConfig----------------------");
        ServletConfig servletConfig  = getServletConfig();

        String keyname = servletConfig.getInitParameter("name");

        System.out.println("keyname: " + keyname);

        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while(initParameterNames.hasMoreElements()) {
            String key = initParameterNames.nextElement();
            System.out.println(key + "=" + getInitParameter(key));
        }

        System.out.println("---------------ServletConfig----------------------");
        ServletContext servletContext = servletConfig.getServletContext();
        ServletContext servletContext1 = request.getServletContext();
        ServletContext servletContext2 = getServletContext();
        System.out.println(servletContext == servletContext1);      // true
        System.out.println(servletContext1 == servletContext2);     // true

        // 获取资源的真实路径
        String realPath = servletContext.getRealPath("upload");
        System.out.println("realPath: " + realPath);

        // 获取项目的上下文路径
        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath: " + contextPath);    // /demo

        // 应用域对象的相关API
        servletContext.setAttribute("myName", "bin");
        Object myName = servletContext.getAttribute("myName");
        servletContext.removeAttribute("myName");
        System.out.println("myName: " + myName);
    }
}
