package com.masai.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.usercases.AdminLogin;
import com.masai.usercases.GetAllBidOfVendor;
import com.masai.usercases.GetAllTenderUseCase;
import com.masai.usercases.GetBiderFromTid;
import com.masai.usercases.NewBidRegistrationUseCase;
import com.masai.usercases.NewTenderRegistrationUseCase;
import com.masai.usercases.VendorLogin;
import com.masai.usercases.VendorRegistrationUseCase;

public class UserActivity {
	
	
	
	public static void selectUser() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out
				.println("Choose an options - \n" + "1. Admin Login\n" + "2. Vendor Login\n");

		System.out.println();
		System.out.println("Enter any number from above: ");

		int choice = 0;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("Invalid input!");

			System.out.println();
			System.out.println("Try again...");

			UserActivity.selectUser();
		}

		switch (choice) {
		case 1:
			System.out.println("Enter admin username");
			String username=sc.next();
			System.out.println("Enter admin password");
			String password=sc.next();
			if(username.equals("harsh") && password.equals("12345")) {
				System.out.println("Admin login successful");
				UserActivity.admin();
			}else {
				System.out.println("Username or password are wrong try again");
				UserActivity.selectUser();
			}
			
			break;
		case 2:
			UserActivity.vendor();
			break;
		default:
			System.out.println("Invalid choice!");
			System.out.println();

			System.out.println("Try again...");
			UserActivity.selectUser();
		}
	}

	public static void admin() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("	 1. Register New Vendor\r\n"
				+ "         2. Create New Tendor.\r\n"
				+ "         3. View All Tenders.\r\n"
				+ "         4. View All Vendors.\r\n"
				+ "         5. View All the Bid for Tendor.\r\n"
				+ "         6. Go Back");
		
		System.out.println();
		System.out.println("Enter any number from above which you want to operate");
		
		int c=0;
		
		try {
			c=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			UserActivity.admin();
		}
		
		switch(c) {
		case 1:
			VendorRegistrationUseCase.register();
			break;
		case 2:
			NewTenderRegistrationUseCase.newTender();
			break;
		case 3:
			GetAllTenderUseCase.viewAllTenders();
			break;
		case 4:
			
			break;
		case 5:
			GetBiderFromTid.getBidOfTender();
			break;
		
		case 6:
			UserActivity.selectUser();
		}
		
		UserActivity.admin();
			
	
		}
	public static void vendor() {
		Scanner sc=new Scanner(System.in);
		System.out.println("	1. Login as a vendor.\r\n"
				+ "	2. View all the current tender.\r\n"
				+ "	3. Place a bid.\r\n"
				+ "	4. View bid history.\r\n"
				+ " 5. Go back");
		
		System.out.println();
		System.out.println("Enter any number from above which you want to operate");
		int c=0;
		
		try {
			c=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!");
			System.out.println("Try again....");
			UserActivity.vendor();
		}
		
		switch(c) {
		case 1:

			VendorLogin.loginAsVendor();
			break;
		case 2:

			GetAllTenderUseCase.viewAllTenders();
			break;
		case 3:

			NewBidRegistrationUseCase.placeNewBid();
			break;
		case 4:
			
			GetAllBidOfVendor.getMyAllBid(null);
			break;
		
		case 5:
		
			UserActivity.selectUser();
			break;
		}
		
		UserActivity.vendor();
		

		
	}

}
