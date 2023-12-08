package com.boot.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

/**
 * @author bin
 * @date 2023-12-08 15:57
 */
@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {

    // 监听初始化
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println("监听器: application " + application.hashCode() + " Initialized");
    }

    // 监听销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println("监听器: application " + application.hashCode() + " Destroyed");
    }

    // 监听数据增加
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext application = scae.getServletContext();
        System.out.println("监听器: application " + application.hashCode() + " add: " + name + "=" + value);
    }

    // 监听数据移除
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext application = scae.getServletContext();
        System.out.println("监听器: application " + application.hashCode() + " removed: " + name + "=" + value);
    }

    // 监听数据修改
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext application = scae.getServletContext();
        System.out.println("监听器: application " + application.hashCode() + " replaced: " + name + "=" + value);
    }
}
