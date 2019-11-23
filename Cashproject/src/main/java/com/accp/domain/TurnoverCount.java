package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 成交记录表和详情表总和
 * @author Administrator
 *
 */
public class TurnoverCount {
	//成交纪律表
	private Integer order_id;

    private Integer userId;

    private Integer order_count;

    private Float order_totalmoney;

    private String order_payment;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date order_date;

    private String ordername;

    private String phone;

    private Integer vid;
    
    private String shopname;
    
    //详情表
    
    private Integer id;

    private Integer goodsId;

    private Double goods_price;

    private Integer goodsCount;

    private Float orderDetailsDiscount;
    
    private String sumprice;
    
    private String tusum;
    
    private String  tuPrice;
    
    
    
    


	public String getTusum() {
		return tusum;
	}

	public void setTusum(String tusum) {
		this.tusum = tusum;
	}

	public String getTuPrice() {
		return tuPrice;
	}

	public void setTuPrice(String tuPrice) {
		this.tuPrice = tuPrice;
	}

	public String getSumprice() {
		return sumprice;
	}

	public void setSumprice(String sumprice) {
		this.sumprice = sumprice;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	

	

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getOrder_count() {
		return order_count;
	}

	public void setOrder_count(Integer order_count) {
		this.order_count = order_count;
	}

	

	public Float getOrder_totalmoney() {
		return order_totalmoney;
	}

	public void setOrder_totalmoney(Float order_totalmoney) {
		this.order_totalmoney = order_totalmoney;
	}

	public String getOrder_payment() {
		return order_payment;
	}

	public void setOrder_payment(String order_payment) {
		this.order_payment = order_payment;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
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

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}


	public Double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(Double goods_price) {
		this.goods_price = goods_price;
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
