package com.springioc.test;

import com.springioc.config.JavaConfiguration;
import com.springioc.proxy.Calculator;
import com.springioc.proxy.CalculatorImpl;
import com.springioc.proxy.CalculatorStaticProxy;
import com.springioc.proxy.ProxyFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author bin
 * @date 2024-01-11 16:09
 */
@SpringJUnitConfig(JavaConfiguration.class)
public class AopTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testStaticProxy() {
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1, 2);
    }

    @Test
    public void testProxyFactory(){
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,1);
    }

    @Test
    public void testAop(){
        int add = calculator.add(1, 1);
        System.out.println("result=" + add);
    }


}
