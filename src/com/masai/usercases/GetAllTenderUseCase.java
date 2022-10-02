package com.masai.usercases;

import java.util.List;

import com.masai.bean.Tender;
import com.masai.dao.Admin;
import com.masai.dao.AdminImpl;
import com.masai.exceptions.NewTenderException;

public class GetAllTenderUseCase {
	
	public static void viewAllTenders() {
		
		Admin a = new AdminImpl();
		
		try {
			
			List<Tender> tenders =  a.getAllTender(null);
			
			tenders.forEach(s -> {
				System.out.println("Tender Id : " + s.getTid());
				System.out.println("Tender name : " + s.getTname());
				System.out.println("Tender type : " + s.getType());
				System.out.println("Tender price : " + s.getTprice());
				System.out.println("Tender info : " + s.getTdesc());
				System.out.println("Tender deadline : " + s.getDeadline());
				System.out.println("Tender work location : " + s.getLoc());
				System.out.println("=====================================================");
				
			});
			
			
		} catch (NewTenderException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
