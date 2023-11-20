package com.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author bin
 * @date 2023-02-06-16:30
 */

@Component
// 自动加载 yml 文件中的数据， 自动加载的类必须是bean
@ConfigurationProperties(prefix = "person")
@Data
@ToString
public class Person {

    private String name;
    private int age;

}