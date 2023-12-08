package com.boot.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author bin
 * @date 2023-12-08 16:14
 */
@WebListener
public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // 任何一个session城对象的创建都会 触发该方法的执行
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 任何一个session城对象的销毁都会触发该方法的执行
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        // 任何一个session城中增加了数据部会触发该方法的执行
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        // 任何一个session城中移除了数据都会触发该方法的执行
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        // 任何一个session城中修改了数据都会触发该方法的执行
    }
}
