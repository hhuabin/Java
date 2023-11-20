package com.boot.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bin
 * @date 2023-02-09-9:28
 */
// 作为 springmvc 的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

//    拦截所有的异常消息
    @ExceptionHandler
    public R doException(Exception ex) {
        R r = new R();
        r.setResult_code("1001");
        r.setErr_msg("异常拦截器");
        ex.printStackTrace();
        return r;
    }
}
