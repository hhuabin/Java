package com.boot.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bin
 * @date 2023-02-23-15:51
 */
@NoArgsConstructor
@Data
public class SMSCode {
    private String phone;
    private String code;
}
