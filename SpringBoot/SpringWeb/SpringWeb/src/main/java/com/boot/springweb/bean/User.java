package com.boot.springweb.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bin
 * @date 2022-11-24-15:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("user") // 数据库表名字
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

}

