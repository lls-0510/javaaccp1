package com.accp.domain;

public class Cashregister {
    private Integer cashregisterid;

    private String commodityimg;

    private String commodityname;

    private String specifications;

    private Float price;

    private Integer count;

    private Float moneyamt;

    private Integer shopid;

    private Integer userid;

    private Integer paycount;

    private String staffid;

    public Integer getCashregisterid() {
        return cashregisterid;
    }

    public void setCashregisterid(Integer cashregisterid) {
        this.cashregisterid = cashregisterid;
    }

    public String getCommodityimg() {
        return commodityimg;
    }

    public void setCommodityimg(String commodityimg) {
        this.commodityimg = commodityimg;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getMoneyamt() {
        return moneyamt;
    }

    public void setMoneyamt(Float moneyamt) {
        this.moneyamt = moneyamt;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPaycount() {
        return paycount;
    }

    public void setPaycount(Integer paycount) {
        this.paycount = paycount;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }
}