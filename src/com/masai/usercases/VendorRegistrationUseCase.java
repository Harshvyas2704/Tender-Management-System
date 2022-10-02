package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Vendor;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.VendorRegisteredException;

public class VendorRegistrationUseCase {
	
	public static void  register(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter Email");
		String email = sc.next();
		
		System.out.println("Enter Mobile");
		String mobile = sc.next();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		System.out.println("Enter Company");
		String company = sc.next();
		
		System.out.println("Enter Username for Vendor");
		String username = sc.next();
		
		System.out.println("Enter password for Vendor");
		String password = sc.next();
		
		Admin a = new AdminImpl();
		
		Vendor vendor = new Vendor(name, email, mobile, address, company, username, password);
		
//		try {
//			
//			String message = a.vendorRegistration(vendor);
//			System.out.println(message);
//			
//		} catch (VendorRegisteredException e) {
//			
//			System.out.println(e.getMessage());
//		}
		
		try {
			String result = a.vendorRegistration(vendor);
			System.out.println(result);
		} catch (VendorRegisteredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		sc.close();
	}

}
