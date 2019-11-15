package com.accp.domain;

public class Turnoverdetails {
    private Integer id;

    private String orderId;

    private Integer goodsId;

    private Double goodsPrice;

    private Integer goodsCount;

    private Float orderDetailsDiscount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Float getOrderDetailsDiscount() {
        return orderDetailsDiscount;
    }

    public void setOrderDetailsDiscount(Float orderDetailsDiscount) {
        this.orderDetailsDiscount = orderDetailsDiscount;
    }
}