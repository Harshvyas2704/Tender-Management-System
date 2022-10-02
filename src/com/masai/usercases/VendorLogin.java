package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Vendor;
import com.masai.dao.VendorImpl;
import com.masai.dao.VendorIn;
import com.masai.exceptions.VendorRegisteredException;

public class VendorLogin {
	
	public static void loginAsVendor() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		VendorIn v = new VendorImpl();
		
		try {
			Vendor vendor =  v.vendorLogin(username, password);
			
			System.out.println("Vendor Id : " + vendor.getVid());
			System.out.println("Vendor Name : " + vendor.getVname());
			System.out.println("Vendor Email : " + vendor.getEmail());
			System.out.println("Vendor Mobile : " + vendor.getMobile());
			System.out.println("Vendor Address : " + vendor.getAddress());
			System.out.println("Vendor Company : " + vendor.getVcompany());
			
		} catch (VendorRegisteredException e) {

			
			
		}
		
	}

}
