package com.springioc.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author bin
 * @date 2024-01-09 17:17
 */
@Component
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloBean {

    //周期方法要求： 方法命名随意，但是要求方法必须是 public void 无形参列表
    @PostConstruct
    public void init() {
        System.out.println("JavaBean init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("JavaBean destory");
    }
}
