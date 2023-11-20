package com.boot.Utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author bin
 * @date 2023-02-23-15:56
 */
@Component
public class CodeUtils {

    public String generator(String phone) {
        Integer hash = phone.hashCode();
        int encryption = 123456;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = "000000" + code;
        return codeStr.substring(codeStr.length() - 6);
    }

    @Cacheable(value = "smsCode", key = "#phone")
    public String getCode(String phone) {
        return null;
    }

    /*public static void main(String[] args) {
        System.out.println(CodeUtils.generator("18402079799"));
    }*/
}
