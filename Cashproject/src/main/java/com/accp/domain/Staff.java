package com.accp.domain;

public class Staff {
    private Integer staffid;

    private String staffname;

    private String staffpwd;

    private String staffphone;

    private String stafftime;

    private String headportrait;

    private String industry;

    private Integer storeid;

    private String cardgo;
    
    private Integer id;
    
    private String storename;
    
    private Integer postid;
    
    
    
    
    
    
    
    public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
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

    public String getCardgo() {
        return cardgo;
    }

    public void setCardgo(String cardgo) {
        this.cardgo = cardgo;
    }
}