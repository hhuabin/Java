package com.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bin
 * @date 2023-02-21-16:46
 */

public class MsgConfig {

    @Bean
    public String msg () {
        return "msg bean";
    }
}
