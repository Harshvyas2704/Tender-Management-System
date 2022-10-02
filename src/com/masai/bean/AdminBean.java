package com.masai.bean;

public class AdminBean {

	private String username;
	
	public AdminBean() {
		
	}
	
	
	
	public AdminBean(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + "]";
	}
	
	
	
}
