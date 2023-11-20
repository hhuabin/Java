package com.boot.service.impl;

import com.boot.service.MessageService;
import com.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bin
 * @date 2023-03-01-15:30
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        System.out.println("订单开始处理");
        messageService.sendMessage(id);

        System.out.println("订单处理结束");
        System.out.println();
    }
}
