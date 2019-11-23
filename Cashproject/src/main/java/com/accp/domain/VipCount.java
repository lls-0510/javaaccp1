package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VipCount {
	//vip
	private Integer vid;

    private Integer vtypeid;

    private String code;

    private Integer userid;

    private String integral;

    private Integer transaction;

    private String vname;

    private String vphone;

    private String vprice;

    private Integer orderId;

    private String commt1;

    private String commt2;

    private String commt3;

    private String province;

    private String city;

    private String area;

    private String street;

    private String vpwd;
    
    //vtype
    
    private Integer vtid;

    private String vtname;

    private Float vtdiscount;
    
    //Turnover
    

    private Integer userId;

    private Integer orderCount;

    private Float orderTotalmoney;

    private String orderPayment;
    
    /*@DateTimeFormat(pattern="yyyy-MMdd")*/
    private String order_date;

    private String ordername;

    private String phone;
    
    
    private Integer countsum;//成交量
    
    private String countprice;//总金额
    
    

	public Integer getCountsum() {
		return countsum;
	}

	public void setCountsum(Integer countsum) {
		this.countsum = countsum;
	}

	public String getCountprice() {
		return countprice;
	}

	public void setCountprice(String countprice) {
		this.countprice = countprice;
	}

	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public Integer getVtypeid() {
		return vtypeid;
	}

	public void setVtypeid(Integer vtypeid) {
		this.vtypeid = vtypeid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public Integer getTransaction() {
		return transaction;
	}

	public void setTransaction(Integer transaction) {
		this.transaction = transaction;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVphone() {
		return vphone;
	}

	public void setVphone(String vphone) {
		this.vphone = vphone;
	}

	public String getVprice() {
		return vprice;
	}

	public void setVprice(String vprice) {
		this.vprice = vprice;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCommt1() {
		return commt1;
	}

	public void setCommt1(String commt1) {
		this.commt1 = commt1;
	}

	public String getCommt2() {
		return commt2;
	}

	public void setCommt2(String commt2) {
		this.commt2 = commt2;
	}

	public String getCommt3() {
		return commt3;
	}

	public void setCommt3(String commt3) {
		this.commt3 = commt3;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getVpwd() {
		return vpwd;
	}

	public void setVpwd(String vpwd) {
		this.vpwd = vpwd;
	}

	public Integer getVtid() {
		return vtid;
	}

	public void setVtid(Integer vtid) {
		this.vtid = vtid;
	}

	public String getVtname() {
		return vtname;
	}

	public void setVtname(String vtname) {
		this.vtname = vtname;
	}

	public Float getVtdiscount() {
		return vtdiscount;
	}

	public void setVtdiscount(Float vtdiscount) {
		this.vtdiscount = vtdiscount;
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

	public String getOrderDate() {
		return order_date;
	}

	public void setOrderDate(String orderDate) {
		this.order_date = orderDate;
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
