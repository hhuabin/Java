package com.mybatis.bean;

/**
 * @author bin
 * @date 2024-01-17 9:55
 */
public class Order {
    private Integer orderId;
    private String orderName;
    private Integer customerId;
    private Customer customer;// 体现的是对一的关系

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String
    toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", customerId=" + customerId +
                ", customer=" + customer +
                '}';
    }
}
