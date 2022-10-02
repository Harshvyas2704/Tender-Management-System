package com.masai.bean;

public class Vendor {
	
	private int vid;
	private String vname;
	private String email;
	private String mobile;
	private String address;
	private String vcompany;
	private String username;
	private String password;
	 
	
	
	
	
	public Vendor(int vid, String vname, String email, String mobile, String address, String vcompany) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.vcompany = vcompany;
	}





	@Override
	public String toString() {
		return "Vender [vid=" + vid + ", vname=" + vname + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", vcompany=" + vcompany + ", username=" + username + ", password=" + password + "]";
	}





	public int getVid() {
		return vid;
	}





	public void setVid(int vid) {
		this.vid = vid;
	}





	public String getVname() {
		return vname;
	}





	public void setVname(String vname) {
		this.vname = vname;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getMobile() {
		return mobile;
	}





	public void setMobile(String mobile) {
		this.mobile = mobile;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public String getVcompany() {
		return vcompany;
	}





	public void setVcompany(String vcompany) {
		this.vcompany = vcompany;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public Vendor(int vid, String vname, String email, String mobile, String address, String vcompany, String username,
			String password) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.vcompany = vcompany;
		this.username = username;
		this.password = password;
	}

	public Vendor(String vname, String email, String mobile, String address, String vcompany, String username,
			String password) {
		super();
		this.vname = vname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.vcompany = vcompany;
		this.username = username;
		this.password = password;
	}



	public Vendor() {
		super();
	}
	
	
	
	
	

}
