package com.boot.service;

import com.boot.bean.SMSCode;

/**
 * @author bin
 * @date 2023-02-23-15:53
 */
public interface SMSCodeService {

    public String sendCode(String phone);
    public boolean checkCode(SMSCode smsCode);
}
