package com.masai.dao;

import java.util.List;

import com.masai.bean.AdminBean;
import com.masai.bean.BiderDTO;
import com.masai.bean.Tender;
import com.masai.bean.Vendor;
import com.masai.exceptions.AdminLoginException;
import com.masai.exceptions.NewBidException;
import com.masai.exceptions.NewTenderException;
import com.masai.exceptions.VendorRegisteredException;

public interface Admin {

	public AdminBean adminLogin(String username, String password) throws AdminLoginException;
	
	public String vendorRegistration (Vendor vendor) throws VendorRegisteredException;
	
	public String newTender(Tender tender) throws NewTenderException;
	
	public List<Tender> getAllTender(Tender tender) throws NewTenderException;
	
	public String AddNewBid(BiderDTO biderdto) throws NewBidException;
	
	public List<BiderDTO> getAllBiderData(int tid) throws NewBidException;
	
	
	
	
	
}
