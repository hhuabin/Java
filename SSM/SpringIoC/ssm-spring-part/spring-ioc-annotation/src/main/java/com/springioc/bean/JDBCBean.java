package com.springioc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author bin
 * @date 2024-01-10 14:33
 */
@Component
public class JDBCBean {

    @Value("${jdbc.user}")
    public String user;

    @Value("${jdbc.password}")
    public String password;

    @Value("${jdbc.Url:url}")
    public String url;

    // 默认使用driver值
    @Value("${driver:driver}")
    public String driver;

    @Override
    public String toString() {
        return "JDBCBean{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}
