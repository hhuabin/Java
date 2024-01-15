package com.springioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author bin
 * @date 2024-01-11 17:19
 */
@ComponentScan("com.springioc")
@Configuration
@EnableAspectJAutoProxy    // 开启aspectj的注解
public class JavaConfiguration {
}
