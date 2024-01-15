package com.springioc;

import com.springioc.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bin
 * @date 2024-01-01 0:46
 */
public class testService {

    @Test
    public  void testRun(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-service.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.findAll();
    }

}
