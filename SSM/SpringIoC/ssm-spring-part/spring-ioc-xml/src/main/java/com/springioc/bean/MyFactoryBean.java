package com.springioc.bean;

/**
 * @author bin
 * @date 2023-12-29 17:13
 */
public class MyFactoryBean {
    // 实例工厂方法，用于创建 Bean 实例
    public MyBean createInstance() {
        // 创建并返回 Bean 的实例
        return new MyBean();
    }
}
