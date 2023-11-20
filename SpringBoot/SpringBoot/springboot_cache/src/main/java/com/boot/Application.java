package com.boot;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching         // 开启默认缓存功能
@EnableCreateCacheAnnotation       // jetcache 启用缓存的主开关
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
