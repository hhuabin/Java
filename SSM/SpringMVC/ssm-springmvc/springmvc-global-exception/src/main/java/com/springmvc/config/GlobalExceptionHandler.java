package com.springmvc.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bin
 * @date 2024-02-21 15:26
 */
// 全局异常拦截器
// 全局异常发生会走此类下的 handler 方法
// @ControllerAdvice     // 可以返回逻辑视图 转发和重定向的
@RestControllerAdvice // @ControllerAdvice + @ResponseBody 返回json字符串
public class GlobalExceptionHandler {

    // @ExceptionHandler(异常种类)
    @ExceptionHandler(ArithmeticException.class)   // 除0异常
    public Object ArithmeticExceptionHandler(ArithmeticException ex) {
        System.out.println("除0异常");
        // 自定义异常处理
        return null;
    }

    // 全部异常，当其他的异常匹配不到才走这里
    @ExceptionHandler(Exception.class)
    public Object ExceptionHandler(Exception ex) {
        // 自定义异常处理
        String message = ex.getMessage();
        System.out.println("message=" + message);
        return message;
    }
}
