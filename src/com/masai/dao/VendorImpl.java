package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.BVTid;

import com.masai.bean.Vendor;
import com.masai.exceptions.VendorRegisteredException;
import com.masai.utility.DBUtil;

public class VendorImpl implements VendorIn {

	@Override
	public Vendor vendorLogin(String username, String password) throws VendorRegisteredException {

		
		Vendor vendor = null;
		
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
					("select * from vendordetails where username = ? AND password = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int vid = rs.getInt("vid");
				String name = rs.getString("vname");
				String email = rs.getString("vemail");
				String mobile = rs.getString("vmobile");
				String address = rs.getString("vaddress");
				String company = rs.getString("vcompany");
				
				vendor = new Vendor(vid, name, email, mobile, address, company);
				
				
			}
			
			else {
				throw new VendorRegisteredException("Invalid Username or Password");
			}
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		return vendor;
		
		
	}

	@Override
	public List<BVTid> getAllBidOfVendor(int vid) throws VendorRegisteredException {
		
		
		List<BVTid> dto = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement
					("select v.vid, v.vname, v.vemail, v.vcompany, "
							+ "t.tid, t.tname, t.ttype, t.tprice from Biderdetails b "
							+ "INNER JOIN vendordetails v INNER JOIN tenderdetails t "
							+ "ON b.vid = v.vid AND b.tid = t.tid where b.vid = ?");
			
			System.out.println("===");
			ps.setInt(1, vid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("v.vid");
				String n = rs.getString("v.vname");
				String e = rs.getString("v.vemail");
				String c = rs.getString("v.vcompany");
				int tid = rs.getInt("t.tid");
				String tn = rs.getString("t.tname");
				String tt = rs.getString("t.ttype");
				int tp = rs.getInt("t.tprice");
				
				BVTid b = new BVTid(id, n, e, c, tid, tn, tt, tp);
				
				dto.add(b);
				
			}
			
			
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}
		
		if(dto.size() == 0) {
			throw new VendorRegisteredException("No Bid found on Vendor Id");
		}
		
		
		
		return dto;
		
	}



	
	
	

}
