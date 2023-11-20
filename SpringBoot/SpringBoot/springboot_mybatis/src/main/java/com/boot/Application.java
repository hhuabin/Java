package com.boot;

import com.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
// 让使用了 @ConfigurationProperties(prefix = "person") 的类成为bean
//@EnableConfigurationProperties(Person.class)
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
        Person bean = configurableApplicationContext.getBean(Person.class);
//        Person person
        System.out.println(bean);
    }

}
