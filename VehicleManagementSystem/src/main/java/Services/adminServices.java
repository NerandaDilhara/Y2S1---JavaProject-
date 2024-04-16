package Services;

import java.sql.ResultSet;
import java.sql.Statement;

import Controller.DBConnect;
import Model.adminModel;

public class adminServices {
	public void insertData(adminModel adModel) {
		try {
			
			String name = adModel.getAdminName();
			String address = adModel.getAdminAddress();
			String email = adModel.getAdminEmail();
			String gender = adModel.getAdminGender();
			String user = adModel.getAdminUserName();
			String pass = adModel.getAdminPassword();
			
			DBConnect db = new DBConnect();
			
			Statement stmt = db.getConnection().createStatement();
			
			String sql = "INSERT INTO admin VALUES('"+0+"', '"+name+"', '"+address+"', '"+email+"', '"+gender+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate(adminModel admin) {
		try {
			String user = admin.getAdminUserName();
			String pass = admin.getAdminPassword();
			
			String sql = "SELECT adminName FROM admin WHERE adminUserName = '"+user+"' AND adminPassword = '"+pass+"'";
			
			Statement stmt = DBConnect.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
	            return true;
	        }
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void showData() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean updateData(adminModel admin) {
		try {
			String name = admin.getAdminName();
			String address = admin.getAdminAddress();
			String sex = admin.getAdminGender();
			String email = admin.getAdminEmail();
			String user = admin.getAdminUserName();
			String pass = admin.getAdminPassword();
			
			Statement stmt = DBConnect.getConnection().createStatement();
			
			String sql1 = "SELECT adminEmail FROM admin WHERE adminUserName='"+admin.getAdminUserName()+"' AND adminPassword='"+admin.getAdminPassword()+"'";
			
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			if(rs1.next()) {
				String sql2 = "UPDATE admin SET adminId='"+0+"', adminName='"+name+"', adminAddress='"+address+"', adminEmail='"+email+"', adminGender='"+sex+"', adminUserName='"+user+"', adminPassword='"+pass+"'";
				stmt.executeUpdate(sql2);
				return true;
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	public boolean deleteData(adminModel admin) {
		try {
			String username = admin.getAdminUserName();
			String password = admin.getAdminPassword();
			
			String sql = "DELETE FROM admin WHERE adminUserName = '"+username+"' AND adminPassword = '"+password+"';";
			
			Statement stmt = DBConnect.getConnection().createStatement();
			
			stmt.executeUpdate(sql);
			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
