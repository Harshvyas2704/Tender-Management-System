package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Tender;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.NewTenderException;

public class NewTenderRegistrationUseCase {
	
	public static void newTender() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Tender Name");
		String name = sc.next();
		
		System.out.println("Enter Tender Type");
		String type = sc.next();
		
		System.out.println("Enter Tender Price");
		int price = sc.nextInt();
		
		System.out.println("Enter Tender Info");
		String desc = sc.next();
		
		System.out.println("Enter Tender Deadline");
		String deadline = sc.next();
		
		System.out.println("Enter Tender Work Location");
		String loc = sc.next();
		
		Admin a = new AdminImpl();
		
		Tender tender = new Tender(name, type, price, desc, deadline, loc);
		
		
		
		try {
			
			String message = a.newTender(tender);
			System.out.println(message);
			
			
		} catch (NewTenderException e) {
			
			System.out.println(e.getMessage());
		}
		
//		sc.close();
		
	}

}
