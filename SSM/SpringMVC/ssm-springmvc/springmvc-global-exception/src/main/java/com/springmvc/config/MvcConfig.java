package com.springmvc.config;

import com.springmvc.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author bin
 * @date 2024-01-18 15:19
 */
@EnableWebMvc  //json数据处理,必须使用此注解,因为他会加入json处理器
@Configuration
@ComponentScan("com.springmvc")
public class MvcConfig implements WebMvcConfigurer {

    // 配置jsp视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    // 开启静态资源查找
    // handlerMapping匹配不到的时候就找静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    // 添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将拦截器添加到Springmvc环境，默认拦截所有Springmvc分发的请求
        // registry.addInterceptor(new MyInterceptor());

        // addPathPatterns 精准拦截, *: 任意一层字符串, **: 任意多层字符串
        // excludePathPatterns 排除拦截
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/user/*", "/user/**")
                .excludePathPatterns("/user/bin");
    }
}
