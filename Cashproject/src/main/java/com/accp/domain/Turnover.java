package com.accp.domain;

import java.util.Date;

public class Turnover {
    private String orderId;

    private Integer userId;

    private Integer orderCount;

    private Float orderTotalmoney;

    private String orderPayment;

    private Date orderDate;

    private String ordername;

    private String phone;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Float getOrderTotalmoney() {
        return orderTotalmoney;
    }

    public void setOrderTotalmoney(Float orderTotalmoney) {
        this.orderTotalmoney = orderTotalmoney;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}