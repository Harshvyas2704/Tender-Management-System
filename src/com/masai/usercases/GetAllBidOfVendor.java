package com.masai.usercases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.BVTid;
import com.masai.dao.VendorImpl;
import com.masai.dao.VendorIn;
import com.masai.exceptions.VendorRegisteredException;

public class GetAllBidOfVendor {
	
	public static void getMyAllBid(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vendor Id");
		int vid = sc.nextInt();
		
		VendorIn v = new VendorImpl();
		
		try {
			List<BVTid> list =  v.getAllBidOfVendor(vid);
			
			list.forEach(s -> {
				
				System.out.println("Vendor Id : " + s.getVid());
				System.out.println("Vendor name : " + s.getName());
				System.out.println("Vendor Email : " + s.getEmail());
				System.out.println("Vendor Company : " + s.getVcompany());
				System.out.println("Tender Id : " + s.getTid());
				System.out.println("Tender Name : " + s.getTname());
				System.out.println("Tender Type : " + s.getTtype());
				System.out.println("Tendor Price : " + s.getTprice());
				System.out.println("====================================");
				
			});
			
			
		} catch (VendorRegisteredException e) {


			System.out.println(e.getMessage());
			
		}
		
	}

}
