package com.springioc.test;

import com.springioc.config.JavaConfiguration;
import com.springioc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author bin
 * @date 2024-01-14 22:14
 */
@SpringJUnitConfig(JavaConfiguration.class)
public class SpringTxTest {

    @Autowired
    public UserService userService;

    @Test
    public void testUpdate() {

    }

}
