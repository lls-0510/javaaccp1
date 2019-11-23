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

    private String scolor;

    private String scc;

    private String bz1;

    private String bz2;
    private int kc; 
    private List<Shopdetails> shopd;  
    private Good good ;

    public int getKc() {
		return kc;
	}

	public void setKc(int kc) {
		this.kc = kc;
	}

	public List<Shopdetails> getShopd() {
		return shopd;
	}

	public void setShopd(List<Shopdetails> shopd) {
		this.shopd = shopd;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
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

    public String getScolor() {
        return scolor;
    }

    public void setScolor(String scolor) {
        this.scolor = scolor;
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
    }
}