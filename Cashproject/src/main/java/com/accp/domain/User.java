package com.accp.domain;

public class User {
    private Integer userid;

    private String username;

    private String userpwd;

    private String userphone;
    
    

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }
    
    
    
    
    public User() {
		super();
	}




	public User(Integer userid, String username, String userpwd, String userphone) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.userphone = userphone;
	}

	public User(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}
	

	public User(String username, String userpwd, String userphone) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.userphone = userphone;
	}

	public User(Integer userid, String username, String userpwd) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", userphone=" + userphone
				+ ", getUserid()=" + getUserid() + ", getUsername()=" + getUsername() + ", getUserpwd()=" + getUserpwd()
				+ ", getUserphone()=" + getUserphone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}