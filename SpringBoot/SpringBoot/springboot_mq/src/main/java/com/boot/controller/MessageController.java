package com.boot.controller;

import com.boot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bin
 * @date 2023-03-01-15:57
 */
@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/msg")
    public String doMessage() {
        String id = messageService.doMessage();
        return id;
    }
}
