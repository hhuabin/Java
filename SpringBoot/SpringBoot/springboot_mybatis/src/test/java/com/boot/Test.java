package com.boot;

import com.boot.config.MsgConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @author bin
 * @date 2023-02-21-16:48
 */
@SpringBootTest
@Import(MsgConfig.class)
public class Test {

    @Autowired
    private String msg;

    @org.junit.jupiter.api.Test
    void test() {
        System.out.println(msg);
    }
}
