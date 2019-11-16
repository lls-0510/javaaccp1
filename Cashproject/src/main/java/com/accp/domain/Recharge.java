package com.accp.domain;

import java.util.Date;

public class Recharge {
    private Integer rechargeid;

    private Date rechargedate;

    private String wechatnumber;

    private String name;

    private String phone;

    private Float recharge;

    private Float give;

    private Float balance;

    private String remarks;

    private Integer vid;

    public Integer getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(Integer rechargeid) {
        this.rechargeid = rechargeid;
    }

    public Date getRechargedate() {
        return rechargedate;
    }

    public void setRechargedate(Date rechargedate) {
        this.rechargedate = rechargedate;
    }

    public String getWechatnumber() {
        return wechatnumber;
    }

    public void setWechatnumber(String wechatnumber) {
        this.wechatnumber = wechatnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getRecharge() {
        return recharge;
    }

    public void setRecharge(Float recharge) {
        this.recharge = recharge;
    }

    public Float getGive() {
        return give;
    }

    public void setGive(Float give) {
        this.give = give;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }
}