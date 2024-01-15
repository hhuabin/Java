package com.springioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author bin
 * @date 2023-12-31 21:56
 */
// 实现 FactoryBean 接口
public class HelloFactoryBean implements FactoryBean<HelloBean> {

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public HelloBean getObject() throws Exception {

        HelloBean helloBean = new HelloBean();

        helloBean.setName("bin");

        return helloBean;
    }

    @Override
    public Class<?> getObjectType() {
        return HelloBean.class;
    }
}
