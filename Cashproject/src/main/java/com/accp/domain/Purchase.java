package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Purchase {
    private Integer purchaseid;

    private Integer userid;

    private String odd;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date deliveryTime;

    private Integer suid;

    private Integer number;

    private Float price;

    private String shop;

    private String suname;

    private String sucompany;

    private String people;

    private String phone;

    private String email;

    private String telephone;

    private String province;

    private String city;

    private String area;

    private String street;
    
    private Integer id;


    private String ltemno;

    private String shapecode;

    private String goodsname;

    private String goodsphoto;

    private String specification;

    private Float costprice;

    private Integer count;

    private Float money;
    
    private String username;

    private String userpwd;

    private Integer userphone;
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

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public String getSucompany() {
		return sucompany;
	}

	public void setSucompany(String sucompany) {
		this.sucompany = sucompany;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public Integer getUserphone() {
		return userphone;
	}

	public void setUserphone(Integer userphone) {
		this.userphone = userphone;
	}

	public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}