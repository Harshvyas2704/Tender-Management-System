package com.masai.dao;

import java.util.List;

import com.masai.bean.BVTid;

import com.masai.bean.Vendor;

import com.masai.exceptions.VendorRegisteredException;

public interface VendorIn {

	public Vendor vendorLogin(String username, String password) throws VendorRegisteredException;
	
	public List<BVTid> getAllBidOfVendor(int vid) throws VendorRegisteredException;
}
