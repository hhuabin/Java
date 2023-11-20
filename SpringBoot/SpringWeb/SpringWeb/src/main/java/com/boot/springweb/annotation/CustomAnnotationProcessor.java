package com.boot.springweb.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义注解处理器
 * @author bin
 * @date 2023-06-28-10:41
 */
@Component
public class CustomAnnotationProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = bean.getClass().getAnnotation(CustomAnnotation.class);
            String value = annotation.value();
            // 处理逻辑
            System.out.println("Processing bean: " + beanName + ", value: " + value);
        }
        return bean;
    }
}
