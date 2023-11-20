package com.boot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author bin
 * @date 2022-11-24-14:15
 */
@Data
public class City {
    private Long id;
    private String user;
    @TableField(select = false)
    private String password;
}
