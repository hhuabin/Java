package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author bin
 * @date 2024-01-18 15:52
 */
// TODO: SpringMVC提供的接口，是替代 web.xml 的方案，更方便实现完全注解方式 ssm 处理!
// TODO: Springmvc框架会自动检查当前类的实现类，会自动加载 getRootConfigClasses / getServletConfigClasses 提供的配置类
// TODO: getServletMappings 返回的地址 设置 DispatherServlet 对应处理的地址
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // 设置配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    // 配置 servlet 的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
