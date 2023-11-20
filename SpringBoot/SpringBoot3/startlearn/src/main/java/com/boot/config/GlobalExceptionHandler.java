package com.boot.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2023-06-02-17:04
 */
//@Slf4j
// 加了 RestController, Controller 注解的类都会被拦截
//@ControllerAdvice(annotations = {RestController.class, Controller.class})
//@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局捕获自定义异常
     * 异常处理方法
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception exception) {
        return "请求出错" + exception.getMessage();
    }
}
