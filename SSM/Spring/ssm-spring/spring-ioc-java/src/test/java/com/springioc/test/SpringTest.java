package com.springioc.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.springioc.config.JavaConfiguration;
import com.springioc.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author bin
 * @date 2024-01-10 15:44
 */

@SpringJUnitConfig(value = {JavaConfiguration.class})
public class SpringTest {

    @Autowired
    private StudentController studentController;

    @Test
    public void test() {
        // 创建 ioc 容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        // 创建方式2
        // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // applicationContext.register(JavaConfiguration.class);
        // applicationContext.refresh();

        // 获取Bean
        StudentController bean = applicationContext.getBean(StudentController.class);
        System.out.println("bean=" + bean);
        System.out.println("bean=" + studentController);
    }

    @Test
    public void testDruidDataSource() {
        // 创建 ioc 容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        // 获取Bean
        DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);
        System.out.println("bean=" + bean);
    }


}
