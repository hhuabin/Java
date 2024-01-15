package com.springioc.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author bin
 * @date 2024-01-12 17:09
 */
@Component
public class MyPointCut {
    @Pointcut("execution(* com.springioc.proxy.CalculatorImpl.*(..))")
    public void pointCut() {}

    @Pointcut("execution(* com.springioc.proxy.CalculatorImpl.*(String, ..))")
    public void pointCut2() {}
}
