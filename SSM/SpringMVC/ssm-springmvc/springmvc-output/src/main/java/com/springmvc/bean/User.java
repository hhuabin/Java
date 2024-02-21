package com.springmvc.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author bin
 * @date 2024-02-05 15:28
 */
@Data
public class User {
    private String name;

    private int age = 18;
}
