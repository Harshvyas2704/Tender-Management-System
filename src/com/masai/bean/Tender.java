package com.masai.bean;

public class Tender {

	private int tid;
	private String tname;
	private String type;
	private int tprice;
	private String tdesc;
	private String deadline;
	private String loc;
	
	
	
	
	public Tender(String tname, String type, int tprice, String tdesc, String deadline, String loc) {
		super();
		this.tname = tname;
		this.type = type;
		this.tprice = tprice;
		this.tdesc = tdesc;
		this.deadline = deadline;
		this.loc = loc;
	}


	public Tender() {
		super();
	}


	@Override
	public String toString() {
		return "Tender [tid=" + tid + ", tname=" + tname + ", type=" + type + ", tprice=" + tprice + ", tdesc=" + tdesc
				+ ", deadline=" + deadline + ", loc=" + loc + "]";
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




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public int getTprice() {
		return tprice;
	}




	public void setTprice(int tprice) {
		this.tprice = tprice;
	}




	public String getTdesc() {
		return tdesc;
	}




	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}




	public String getDeadline() {
		return deadline;
	}




	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}




	public String getLoc() {
		return loc;
	}




	public void setLoc(String loc) {
		this.loc = loc;
	}




	public Tender(int tid, String tname, String type, int tprice, String tdesc, String deadline, String loc) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.type = type;
		this.tprice = tprice;
		this.tdesc = tdesc;
		this.deadline = deadline;
		this.loc = loc;
	}
	
	
	
	
	
}
