package com.boot.service.impl;

import com.boot.service.SendMailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author bin
 * @date 2023-03-01-11:15
 */
@Service
public class SendMailServiceImpl2 implements SendMailService {

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
//    private String context = "<a href='https://bilibili.com'/>";
    private String context = "<img src='...'/>";

    @Override
    public void sendMail() {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(from + "(小可爱)");
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(context, true);

            // 添加附件
            File file = new File("D:\\binn\\Java\\Java\\SpringBoot\\springboot01\\src\\main\\resources\\avatar.jpg");
            mimeMessageHelper.addAttachment("avatar", file);

            // 发送邮件
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
