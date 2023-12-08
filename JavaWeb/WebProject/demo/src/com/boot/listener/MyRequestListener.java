package com.boot.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author bin
 * @date 2023-12-08 16:34
 */
@WebListener
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 任何一个请求域对象的销毁都会触发该方法的执行
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // 任何一个请求域对象的初始化都会触发该方法的执行
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // 任何一个请求域中增加了数据部会触发该方法的执行
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // 任何一个请求域中删除了数据都会触发该方法的执行
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // 任何一个请求城中修改了数都会触发该方法的执行
    }
}
