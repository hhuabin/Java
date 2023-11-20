package com.boot.service.impl;

import com.boot.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bin
 * @date 2023-03-01-11:15
 */
@Deprecated
//@Service
public class SendMailServiceImpl implements SendMailService {

    // 自动装配 javamail 的类
    @Resource
    private JavaMailSender javaMailSender;

    // 发送人
    private String from = "158";
    // 接收人
    private String to = "158";
    // 标题
    private String subject = "测试邮件";
    // 正文
    private String context = "测试邮件内容";

    @Override
    public void sendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(context);
        // 发送邮件
        javaMailSender.send(simpleMailMessage);
    }
}
