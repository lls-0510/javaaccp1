package com.accp.domain;

public class Nexus {
    private Integer id;

    private Integer zid;

    private Integer jid;
    
    public Nexus(Integer zid, Integer jid) {
		super();
		this.zid =zid;
		this.jid = jid;
	}

	
    public Nexus() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}