package Services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Controller.DBConnect;
import Model.CustomerModel;
import Model.adminModel;

public class customerSevices {
	public void insertData(CustomerModel custModel) {
		try {
			
			String name = custModel.getCustName();
			String address = custModel.getCustAddress();
			String email = custModel.getCustEmail();
			String gender = custModel.getCustGender();
			String user = custModel.getCustUserName();
			String pass = custModel.getCustPassword();
			
			// DBConnect db = new DBConnect();
			
			Statement stmt = DBConnect.getConnection().createStatement();

			
			String sql = "INSERT INTO customer VALUES('"+0+"', '"+name+"', '"+address+"', '"+email+"', '"+gender+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//	
//	public boolean validate(adminModel admin) {
//		try {
//			String user = admin.getAdminUserName();
//			String pass = admin.getAdminPassword();
//			
//			String sql = "SELECT adminName FROM admin WHERE adminUserName = '"+user+"' AND adminPassword = '"+pass+"'";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			
//			ResultSet rs = stmt.executeQuery(sql);
//			
//			if(rs.next()) {
//	            return true;
//	        }
//			
//			stmt.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//	public ArrayList showData(adminModel admin) {
//		try {
//			Statement stmt = DBConnect.getConnection().createStatement();
//			
//			String sql = "SELECT * FROM admin WHERE adminUserName='"+admin.getAdminUserName()+"' AND adminPassword='"+admin.getAdminPassword()+"'";
//			
//			ResultSet rs1 = stmt.executeQuery(sql);
//			
//			ArrayList<String> adminDetails = new ArrayList<>();
//			
//			if(rs1.next()) {
//				adminDetails.add(rs1.getString("adminName"));
//				adminDetails.add(rs1.getString("adminAddress"));
//				adminDetails.add(rs1.getString("adminEmail"));
//				adminDetails.add(rs1.getString("adminGender"));
//				adminDetails.add(rs1.getString("adminUserName"));
//				adminDetails.add(rs1.getString("adminPassword"));
//				
//				return adminDetails;
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public boolean updateData(adminModel admin){
//	
//
//		try {
//			String name = admin.getAdminName();
//			String address = admin.getAdminAddress();
//			String email = admin.getAdminEmail();
//			String gender = admin.getAdminGender();
//			String user = admin.getAdminUserName();
//			String pass = admin.getAdminPassword();
//			
//			String sql = "UPDATE admin SET adminName='"+name+"', adminAddress='"+address+"', adminEmail='"+email+"', adminGender='"+gender+"', adminUserName='"+user+"', adminPassword='"+pass+"' WHERE adminUserName ='"+user+"'";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			stmt.executeUpdate(sql);
//			
//			return true;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//
//	public boolean deleteData(adminModel admin) {
//		try {
//			String username = admin.getAdminUserName();
//			String password = admin.getAdminPassword();
//			
//			String sql = "DELETE FROM admin WHERE adminUserName = '"+username+"' AND adminPassword = '"+password+"';";
//			
//			Statement stmt = DBConnect.getConnection().createStatement();
//			
//			stmt.executeUpdate(sql);
//			
//			return true;
//			
//		}catch(Exception e) {
//			return false;
//		}
//	}
}
