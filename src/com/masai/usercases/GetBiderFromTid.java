package com.masai.usercases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.BiderDTO;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.NewBidException;

public class GetBiderFromTid {
	
	public static void getBidOfTender() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Tender Id");
		int tid = sc.nextInt();
		
		Admin a = new AdminImpl();
		
		
		
		try {
			
			List<BiderDTO> l = a.getAllBiderData(tid);
			
			l.forEach(s -> {
				System.out.println("Bid Id : " + s.getBid());
				System.out.println("Vendor Id :" + s.getVid());
				System.out.println("Deadline of tender :" + s.getDeadline());
				System.out.println("Tender Status : " + s.getStatus());
				System.out.println("===============================");
			});
		
		} catch (NewBidException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
