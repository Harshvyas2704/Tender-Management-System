package com.masai.bean;

public class BiderDTO {

	
	private int bid;
	private int vid;
	private int tid;
	private int bidprice;
	private String deadline;
	private int status;
	
	
	
	

	public BiderDTO(String deadline, int bid, int vid, int bidprice,  int status) {
		super();
		this.bid = bid;
		this.vid = vid;
		this.bidprice = bidprice;
		this.deadline = deadline;
		this.status = status;
	}
	
	public BiderDTO(int vid, int tid, int bidprice, String deadline, int status) {
		super();
		this.vid = vid;
		this.tid = tid;
		this.bidprice = bidprice;
		this.deadline = deadline;
		this.status = status;
	}

	public BiderDTO(int tid) {
		super();
		this.tid = tid;
	}
	
	public BiderDTO(int vid, int bidprice, String deadline, int status) {
		super();
		this.vid = vid;
		this.bidprice = bidprice;
		this.deadline = deadline;
		this.status = status;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getBidprice() {
		return bidprice;
	}
	public void setBidprice(int bidprice) {
		this.bidprice = bidprice;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "BiderDTO [bid=" + bid + ", vid=" + vid + ", tid=" + tid + ", bidprice=" + bidprice + ", deadline="
				+ deadline + ", status=" + status + "]";
	}
	
	
	public BiderDTO(int bid, int vid, int tid, int bidprice, String deadline, int status) {
		super();
		this.bid = bid;
		this.vid = vid;
		this.tid = tid;
		this.bidprice = bidprice;
		this.deadline = deadline;
		this.status = status;
	}
	
	
	
	
	
	
	
	public BiderDTO() {
		super();
	}
	
	
	
}
