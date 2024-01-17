package com.mybatis.bean;

import java.util.List;

/**
 * @author bin
 * @date 2024-01-17 9:54
 */
public class Customer {
    private Integer customerId;
    private String customerName;
    private List<Order> orderList;// 体现的是对多的关系

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String
    toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
