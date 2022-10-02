package com.masai.bean;

public class BVTid {
	
	private int vid;
	private String name;
	private String email;
	private String vcompany;
	private int tid;
	private String tname;
	private String ttype;
	private int tprice;
	
	
	public BVTid(int vid, String name, String email, String vcompany, int tid, String tname, String ttype, int tprice) {
		super();
		this.vid = vid;
		this.name = name;
		this.email = email;
		this.vcompany = vcompany;
		this.tid = tid;
		this.tname = tname;
		this.ttype = ttype;
		this.tprice = tprice;
	}


	public BVTid() {
		super();
	}


	public int getVid() {
		return vid;
	}


	public void setVid(int vid) {
		this.vid = vid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getVcompany() {
		return vcompany;
	}


	public void setVcompany(String vcompany) {
		this.vcompany = vcompany;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getTtype() {
		return ttype;
	}


	public void setTtype(String ttype) {
		this.ttype = ttype;
	}


	public int getTprice() {
		return tprice;
	}


	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	
	
	

}
