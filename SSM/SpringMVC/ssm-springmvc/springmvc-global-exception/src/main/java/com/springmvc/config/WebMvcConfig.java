package com.springmvc.config;

import com.springmvc.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author bin
 * @date 2024-01-18 15:19
 */
@EnableWebMvc  // json 数据处理，必须使用此注解，因为他会加入 json 处理器
@Configuration
@ComponentScan("com.springmvc")
public class WebMvcConfig implements WebMvcConfigurer {

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
        // 将拦截器添加到Springmvc环境，默认拦截所有 Springmvc 分发的请求
        // registry.addInterceptor(new MyInterceptor());

        registry.addInterceptor(new MyInterceptor())
                // 设置拦截路径
                .addPathPatterns("/user/*", "/user/**")
                // 设置排除路径
                .excludePathPatterns(
                        "/user/login",
                        "/user/register",
                        "/user/public/**",
                        "/user/bin"
                );
    }
}
