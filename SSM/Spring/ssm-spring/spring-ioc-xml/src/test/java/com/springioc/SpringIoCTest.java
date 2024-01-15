package com.springioc;

import com.springioc.bean.HelloBean;
import com.springioc.bean.MyBean;
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
    public void testIOC2() {
        // 获取 IOC 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springioc2.xml");
        // 获取 IOC 容器中的 bean
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        myBean.sayHello();
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

    @Test
    public void testFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springioc2.xml");

        // 获取HelloBean (FactoryBean.getObject)
        HelloBean helloBean = applicationContext.getBean("helloBean", HelloBean.class);
        System.out.println(helloBean);
        System.out.println(helloBean.getName());

        //如果想要获取FactoryBean对象, 直接在id前添加&符号即可!  &helloBean 这是一种固定的约束
        Object helloFactoryBean = applicationContext.getBean("&helloBean");
        System.out.println(helloFactoryBean);
    }
}
