package com.springioc.bean;

/**
 * @author bin
 * @date 2023-12-22 14:57
 */
public class HelloBean {

    private static HelloBean helloBean = new HelloBean();

    public void sayHello() {
        System.out.println("hello bean");
    }

    public static HelloBean createInstance() {
        return helloBean;
    }

    public void init() {
        System.out.println("JavaBean init");
    }

    public void destory() {
        System.out.println("JavaBean destory");
    }
}
