package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Purchase {
    private Integer purid;

    private String purno;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purdata;

    private Integer gysid;

    private Integer staffid;

    private String purtext;
    

    private String bz1;

    private String bz2;

    private String bz3;

    private List<Pruchasedetails> prd;
    
    private Supplier sp;
    
    public Supplier getSp() {
		return sp;
	}

	public void setSp(Supplier sp) {
		this.sp = sp;
	}

	public List<Pruchasedetails> getPrd() {
		return prd;
	}

	public void setPrd(List<Pruchasedetails> prd) {
		this.prd = prd;
	}

	public Integer getPurid() {
        return purid;
    }

    public void setPurid(Integer purid) {
        this.purid = purid;
    }

    public String getPurno() {
        return purno;
    }

    public void setPurno(String purno) {
        this.purno = purno;
    }

    public Date getPurdata() {
        return purdata;
    }

    public void setPurdata(Date purdata) {
        this.purdata = purdata;
    }

    public Integer getGysid() {
        return gysid;
    }

    public void setGysid(Integer gysid) {
        this.gysid = gysid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getPurtext() {
        return purtext;
    }

    public void setPurtext(String purtext) {
        this.purtext = purtext;
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

    public String getBz3() {
        return bz3;
    }

    public void setBz3(String bz3) {
        this.bz3 = bz3;
    }
}