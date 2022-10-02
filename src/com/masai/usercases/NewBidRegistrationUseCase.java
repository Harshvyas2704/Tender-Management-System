package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.BiderDTO;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.NewBidException;

public class NewBidRegistrationUseCase {
	
	public static void placeNewBid() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vendor ID");
		int vid = sc.nextInt();
		
		System.out.println("Enter Tender ID");
		int tid = sc.nextInt();
		
		System.out.println("Enter Your Bid Price");
		int bidPrice = sc.nextInt();
		
		System.out.println("Enter Tender Deadline");
		String deadline = sc.next();
		
		System.out.println("Enter Status");
		int status = sc.nextInt();
		
		BiderDTO biderdto = new BiderDTO(vid, tid, bidPrice, deadline, status);
		
		Admin a = new AdminImpl();
		
		try {
			String message = a.AddNewBid(biderdto);
			System.out.println(message);
		} catch (NewBidException e) {
			
			System.out.println(e.getMessage());
			
		}
		
//		sc.close();
	}

}
