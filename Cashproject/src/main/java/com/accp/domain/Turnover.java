package com.accp.domain;

import java.util.Date;
import java.util.List;

public class Turnover {
    private Integer orderId;

    private Integer userId;

    private Integer orderCount;

    private Float orderTotalmoney;

    private String orderPayment;

    private Date orderDate;

    private String ordername;

    private String phone;

    private Integer vid;
    
    private List<Turnoverdetails> turns;

    public List<Turnoverdetails> getTurns() {
		return turns;
	}

	public void setTurns(List<Turnoverdetails> turns) {
		this.turns = turns;
	}

	public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
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

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}