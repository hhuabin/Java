package com.boot.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bin
 * @date 2023-02-08-17:40
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class R {
    private String result_code;
    private String err_msg = "";
    private Object data;
}
