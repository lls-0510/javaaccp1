package com.accp.domain;

public class Post {
    private Integer id;

    private String type;

    private Integer userid;

    private Integer jurisdictionid;

    private String coummt1;

    private String coummt2;

    private String coummt3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public String getCoummt1() {
        return coummt1;
    }

    public void setCoummt1(String coummt1) {
        this.coummt1 = coummt1;
    }

    public String getCoummt2() {
        return coummt2;
    }

    public void setCoummt2(String coummt2) {
        this.coummt2 = coummt2;
    }

    public String getCoummt3() {
        return coummt3;
    }

    public void setCoummt3(String coummt3) {
        this.coummt3 = coummt3;
    }
}