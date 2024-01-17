package com.mybatis.mapper;

import com.mybatis.bean.Order;

/**
 * @author bin
 * @date 2024-01-17 9:57
 */
public interface OrderMapper {
    Order queryOrderById(Integer orderId);
}
