package com.accp.domain;

public class Purchasedetails {
    private Integer id;

    private Integer purchaseid;

    private String ltemno;

    private String shapecode;

    private String goodsname;

    private String goodsphoto;

    private String specification;

    private Float costprice;

    private Integer count;

    private Float money;
    
    private String time;
    
    private String remarks;
    
    

    
    
    public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    

    public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getLtemno() {
        return ltemno;
    }

    public void setLtemno(String ltemno) {
        this.ltemno = ltemno;
    }

    public String getShapecode() {
        return shapecode;
    }

    public void setShapecode(String shapecode) {
        this.shapecode = shapecode;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsphoto() {
        return goodsphoto;
    }

    public void setGoodsphoto(String goodsphoto) {
        this.goodsphoto = goodsphoto;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}