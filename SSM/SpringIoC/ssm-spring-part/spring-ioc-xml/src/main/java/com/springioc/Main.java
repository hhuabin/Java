package com.springioc;

import com.springioc.bean.HelloBean;
import com.springioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author bin
 * @date 2023-12-21 17:27
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("基于XML方式管理Bean");

        // 获取 IOC 容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("springioc.xml");
        // 获取 IOC 容器中的 bean
        HelloBean helloBean = (HelloBean) ioc.getBean("helloBean");
        // helloBean.sayHello();

        UserService userService = (UserService) ioc.getBean("userService");
        System.out.println(userService.getName());
    }
}