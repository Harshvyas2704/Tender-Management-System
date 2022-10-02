package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.AdminBean;
import com.masai.bean.BiderDTO;
import com.masai.bean.Tender;
import com.masai.bean.Vendor;
import com.masai.exceptions.AdminLoginException;
import com.masai.exceptions.NewBidException;
import com.masai.exceptions.NewTenderException;
import com.masai.exceptions.VendorRegisteredException;
import com.masai.utility.DBUtil;

public class AdminImpl implements Admin {

	@Override
	public AdminBean adminLogin(String username, String password) throws AdminLoginException {
		
		AdminBean ab = null;
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement
			("select username from admin where username = ? AND password = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				String n = rs.getString("username");
				ab = new AdminBean(n);
				
			}
			else {
				throw new AdminLoginException("Invalid username or password");
			}
			
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return ab;
	}

	//==================================================================
	
	@Override
	public String vendorRegistration(Vendor vendor) throws VendorRegisteredException {
		
		String message = "Vender not registred...";
		
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = 
					conn.prepareStatement
					("insert into vendordetails "
							+ "(vname, vemail, vmobile, vaddress, "
							+ "vcompany, username, password) values "
							+ "(?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, vendor.getVname());
			ps.setString(2, vendor.getEmail());
			ps.setString(3, vendor.getMobile());
			ps.setString(4, vendor.getAddress());
			ps.setString(5, vendor.getVcompany());
			ps.setString(6, vendor.getUsername());
			ps.setString(7, vendor.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				
				message = "Vendor registered successfully";
				
			}
			
			
		}catch (SQLException e) {
			
			throw new VendorRegisteredException("Not registered...");
			
		}
		
		
		return message;
	}
	
	//=============================================================

	@Override
	public String newTender(Tender tender) throws NewTenderException {
		String message = "Tender not inserted...";
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = 
					conn.prepareStatement("insert into tenderdetails "
							+ "(tname, ttype, tprice, tdesc, tdeadline, tloc) "
							+ "values (?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, tender.getTname());
			ps.setString(2, tender.getType());
			ps.setInt(3, tender.getTprice());
			ps.setString(4, tender.getTdesc());
			ps.setString(5, tender.getDeadline());
			ps.setString(6, tender.getLoc());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Tender inserted successfully...";
			}
			
		} catch (Exception e) {

			throw new NewTenderException("Invalid details entered...");
			
		}
		
		
		return message;
	}

	//==================================================================
	
	@Override
	public List<Tender> getAllTender(Tender tender) throws NewTenderException {

		List<Tender> tenders = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
					("select * from tenderdetails");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int tid = rs.getInt("tid");
				String tname = rs.getString("tname");
				String ttype = rs.getString("ttype");
				int price = rs.getInt("tprice");
				String tdesc = rs.getString("tdesc");
				String tdeadline = rs.getString("tdeadline");
				String tloc = rs.getString("tloc");
				
				Tender t = new Tender(tid, tname, ttype, price, tdesc, tdeadline, tloc);
				
				tenders.add(t);
				
			}
			
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		if(tenders.size() == 0)  {
			
			throw new NewTenderException("No tender found");
			
		}
		
		
		return tenders;
		
	}

	//==================================================================
	
	@Override
	public String AddNewBid(BiderDTO biderdto) throws NewBidException {
		
		String message = "Bid not added";
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
			("insert into biderdetails (vid, tid, bidprice, deadline, bidstatus) values (?, ?, ?, ?, ?)");
			
			ps.setInt(1, biderdto.getVid());
			ps.setInt(2, biderdto.getTid());
			ps.setInt(3, biderdto.getBidprice());
			ps.setString(4, biderdto.getDeadline());
			ps.setInt(5, biderdto.getStatus());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Bid inserted successfully";
			}
			else {
				throw new NewBidException("Invalid bid details...");
			}
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		return message;
	}
	
	//==================================================================

	@Override
	public List<BiderDTO> getAllBiderData(int tid) throws NewBidException {
		
		
		List<BiderDTO> bider = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("select * from biderdetails where tid = ?");
			
			ps.setInt(1, tid);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int bid = rs.getInt("bid");
				int vid = rs.getInt("vid");
				int bidprice = rs.getInt("bidprice");
				String deadline = rs.getString("deadline");
				int status = rs.getInt("bidstatus");
				
				BiderDTO dto = new BiderDTO(deadline, bid, vid, bidprice, status);
				
				bider.add(dto);
			}
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		if(bider.size() == 0)  {
			
			throw new NewBidException("No tender found");
			
		}
		
		
		return bider;
	}
	
	

	

	
	
	
}
