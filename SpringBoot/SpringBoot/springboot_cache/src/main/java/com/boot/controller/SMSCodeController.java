package com.boot.controller;

import com.boot.bean.SMSCode;
import com.boot.service.SMSCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author bin
 * @date 2023-02-23-15:54
 */
@Slf4j
@RestController
@RequestMapping("/sms")
public class SMSCodeController {
    @Autowired
    private SMSCodeService smsCodeService;

    @GetMapping("/getcode")
    public String getCode(String phone) {

        return smsCodeService.sendCode(phone);
    }

    @PostMapping("checkcode")
    public boolean checkCode(@RequestBody SMSCode smsCode) {
        System.out.println(smsCode);
        return smsCodeService.checkCode(smsCode);
    }

}
