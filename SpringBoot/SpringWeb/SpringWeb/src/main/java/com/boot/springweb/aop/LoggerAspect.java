package com.boot.springweb.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
 * 切面 AOP
 * @author bin
 * @date 2023-06-28-16:31
 */
@Slf4j
@Aspect
@Component
public class LoggerAspect {

    // com.example.demo.service.*.*(..))" 表示拦截 com.example.demo.service 包下的所有类的所有方法
    @Before("execution(* com.boot.springweb.controller.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 获取连接点对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        // 获取连接点对应方法的参数
        Object[] args = joinPoint.getArgs();

        log.info("Before method execution\n" + signature.getName() + "参数：" + Arrays.toString(args));
    }

    @After("execution(* com.boot.springweb.controller.*.*(..))")
    public void afterAdvice() {
        log.info("After method execution");
    }
}
