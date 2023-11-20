package com.boot.service.impl;

import com.boot.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author bin
 * @date 2023-03-01-15:33
 */
@Service
public class MessageServiceImpl implements MessageService {

    private ArrayList msgList = new ArrayList<String>();

    @Override
    public void sendMessage(String id) {
        System.out.println("收到待发送短信");
        msgList.add(id);
    }

    @Override
    public String doMessage() {
        String id = (String) msgList.remove(0);
        System.out.println("发送短信， id=" + id);
        return id;
    }
}
