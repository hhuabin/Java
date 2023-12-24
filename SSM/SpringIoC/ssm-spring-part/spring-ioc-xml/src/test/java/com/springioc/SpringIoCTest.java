package com.springioc;

import com.springioc.bean.HelloBean;
import com.springioc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bin
 * @date 2023-12-22 16:28
 */
public class SpringIoCTest {

    @Test
    public void testIOC() {

        // 获取 IOC 容器
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springioc.xml");
        // // 获取 IOC 容器中的 bean
        // UserService userService = (UserService) applicationContext.getBean("userService");
        // System.out.println(userService.getName());

        // 获取 IOC 容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("springioc.xml");
        applicationContext.refresh();
        // 获取 IOC 容器中的 bean
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.getName());
    }

    @Test
    public void testLifeCycle() {
        // 获取 IOC 容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springioc.xml");
        // 销毁
        applicationContext.close();
    }

    @Test
    public void testScope() {
        // 获取 IOC 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springioc.xml");
        // 获取 IOC 容器中的 bean
        HelloBean helloBean = (HelloBean) applicationContext.getBean(HelloBean.class);
        HelloBean helloBean2 = (HelloBean) applicationContext.getBean(HelloBean.class);
        System.out.println(helloBean == helloBean2);
    }
}
