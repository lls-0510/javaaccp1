package com.accp.domain;

import java.util.List;

public class Shop {
    private Integer sid;

    private String shh;

    private String sname;

    private Double sdpprice;

    private Double scbprice;

    private Integer goodid;

    private String goodimg;

    private String goodtext;

    private List<Shopdetails> shopd;
    
    public List<Shopdetails> getShopd() {
		return shopd;
	}

	public void setShopd(List<Shopdetails> shopd) {
		this.shopd = shopd;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getShh() {
        return shh;
    }

    public void setShh(String shh) {
        this.shh = shh;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getSdpprice() {
        return sdpprice;
    }

    public void setSdpprice(Double sdpprice) {
        this.sdpprice = sdpprice;
    }

    public Double getScbprice() {
        return scbprice;
    }

    public void setScbprice(Double scbprice) {
        this.scbprice = scbprice;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getGoodimg() {
        return goodimg;
    }

    public void setGoodimg(String goodimg) {
        this.goodimg = goodimg;
    }

    public String getGoodtext() {
        return goodtext;
    }

    public void setGoodtext(String goodtext) {
        this.goodtext = goodtext;
    }
}