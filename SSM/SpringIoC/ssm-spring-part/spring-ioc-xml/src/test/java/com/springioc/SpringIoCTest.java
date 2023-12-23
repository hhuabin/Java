package com.springioc;

import com.springioc.service.UserService;
import org.junit.jupiter.api.Test;
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
}
