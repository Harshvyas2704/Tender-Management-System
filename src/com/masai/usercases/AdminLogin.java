package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.AdminBean;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.AdminLoginException;

public class AdminLogin {
	
	public static boolean isCorrect = false;


	public static void adminLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		Admin a = new AdminImpl();
		

		
		AdminBean ab;
		try {
			ab = a.adminLogin(username, password);
			System.out.println(ab.getUsername());
			if(ab.getUsername().equals(username)) {
				
				isCorrect = true;
				
			}

		} catch (AdminLoginException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
//		sc.close();
	}
	
}
