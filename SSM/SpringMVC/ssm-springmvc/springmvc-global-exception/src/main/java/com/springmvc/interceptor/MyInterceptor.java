package com.springmvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bin
 * @date 2024-02-21 15:51
 */

public class MyInterceptor implements HandlerInterceptor {

    /**
     * 在处理请求的目标 handler 方法前执行。如登录保护，权限处理
     * @param request 请求对象
     * @param response 响应对象
     * @param handler handler 方法
     * @return 返回 true 放行，false 拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        // 返回 true-放行，返回 false-不放行
        return true;
    }

    /**
     * 在 handler 方法执行之后触发的方法
     * 用法：对结果处理，对敏感词汇处理
     * @param request 请求对象
     * @param response 响应对象
     * @param handler handler 方法
     * @param modelAndView 视图和共享域对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor.postHandle");
    }

    // 渲染视图之后执行（一定执行）

    /**
     * 整体处理完毕
     * @param request
     * @param response
     * @param handler
     * @param ex 如果 handler 报错就是异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor.afterCompletion");
    }
}
