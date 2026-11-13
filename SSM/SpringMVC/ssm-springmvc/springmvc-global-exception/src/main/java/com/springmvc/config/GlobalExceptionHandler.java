package com.springmvc.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bin
 * @date 2024-02-21 15:26
 */
// 全局异常拦截器
// 全局异常发生会走此类下的 handler 方法
@ResponseBody
@ControllerAdvice                     // 可以返回逻辑视图 转发和重定向的
// @RestControllerAdvice              // @ControllerAdvice + @ResponseBody
public class GlobalExceptionHandler {

    // @ExceptionHandler(异常种类)
    @ExceptionHandler(ArithmeticException.class)   // 除0异常
    public Object ArithmeticExceptionHandler(ArithmeticException ex) {
        System.out.println("除0异常");
        // 返回内容给前端
        return "exception";
    }

    // 全部异常，当其他的异常匹配不到才走这里
    @ExceptionHandler(Exception.class)
    public Object ExceptionHandler(Exception ex) {
        String message = ex.getMessage();
        System.out.println("message=" + message);
        return message;
    }
}
