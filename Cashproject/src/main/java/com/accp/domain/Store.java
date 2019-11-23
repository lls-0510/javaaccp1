package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Store {
    private Integer id;

    private Integer did;

    private String people;

    private String phone;

    private String telephone;
  /*  @JsonFormat(pattern="yyyy-MM-dd")*/
    private String startime;

    /*@JsonFormat(pattern="yyyy-MM-dd")*/
    private String endtime;

    private String province;

    private String city;

    private String area;

    private String ditem;

    private String storename;

    private String card;
    
    private Integer staffid;

    private String staffname;

    private String staffpwd;

    private String staffphone;

    private String stafftime;

    private String headportrait;

    private String industry;

    private Integer storeid;
    
    private Integer staffcount;

	 private String img;

    private String remark;

    private String jcname;

    private String coummt1;

    private String count2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getStartime() {
		return startime;
	}

	public void setStartime(String startime) {
		this.startime = startime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
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

	public String getDitem() {
		return ditem;
	}

	public void setDitem(String ditem) {
		this.ditem = ditem;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Integer getStaffid() {
		return staffid;
	}

	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffpwd() {
		return staffpwd;
	}

	public void setStaffpwd(String staffpwd) {
		this.staffpwd = staffpwd;
	}

	public String getStaffphone() {
		return staffphone;
	}

	public void setStaffphone(String staffphone) {
		this.staffphone = staffphone;
	}

	public String getStafftime() {
		return stafftime;
	}

	public void setStafftime(String stafftime) {
		this.stafftime = stafftime;
	}

	public String getHeadportrait() {
		return headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getStoreid() {
		return storeid;
	}

	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}

	public Integer getStaffcount() {
		return staffcount;
	}

	public void setStaffcount(Integer staffcount) {
		this.staffcount = staffcount;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getJcname() {
		return jcname;
	}

	public void setJcname(String jcname) {
		this.jcname = jcname;
	}

	public String getCoummt1() {
		return coummt1;
	}

	public void setCoummt1(String coummt1) {
		this.coummt1 = coummt1;
	}

	public String getCount2() {
		return count2;
	}

	public void setCount2(String count2) {
		this.count2 = count2;
	}
    
    

}