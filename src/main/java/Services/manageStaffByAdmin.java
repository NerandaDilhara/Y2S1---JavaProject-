package Services;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Controller.DBConnect;
import Model.adminModel;
import Model.staffModel;

public class manageStaffByAdmin {
	
	public void insertData(staffModel staff) {
		try {
			
			String name = staff.getStaffName();
			String address = staff.getStaffAddress();
			String email = staff.getStaffEmail();
			String gender = staff.getStaffGender();
			String user = staff.getStaffUserName();
			String pass = staff.getStaffPassword();	
			
			DBConnect db = new DBConnect();
			
			Statement stmt = (Statement) db.getConnection().createStatement();
			
			String sql = "INSERT INTO staff VALUES('"+0+"', '"+name+"', '"+address+"', '"+email+"', '"+gender+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
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
	public ArrayList<ArrayList<String>> showData(staffModel staff) {
		
	    ArrayList<ArrayList<String>> allStaffDetails = new ArrayList<>(); // ArrayList to store all rows

	    try {
	        Statement stmt = (Statement) DBConnect.getConnection().createStatement();

	        String sql = "SELECT * FROM staff";

	        ResultSet rs1 = stmt.executeQuery(sql);

	        while(rs1.next()) {
	            ArrayList<String> staffDetails = new ArrayList<>(); // ArrayList to store details of one row
	            staffDetails.add(rs1.getString("staffName"));
	            staffDetails.add(rs1.getString("staffAddress"));
	            staffDetails.add(rs1.getString("staffEmail"));
	            staffDetails.add(rs1.getString("staffGender"));
	            staffDetails.add(rs1.getString("staffUserName"));
	            staffDetails.add(rs1.getString("staffPassword"));
	            
	            allStaffDetails.add(staffDetails); // Add the details of one row to the main ArrayList
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return allStaffDetails; // Return the ArrayList containing details of all rows
	}
	
	public ArrayList<String> showData2(staffModel staff) {
		try {
			Statement stmt = (Statement) DBConnect.getConnection().createStatement();
			
			String user = staff.getStaffUserName();
			
			String sql1 = "SELECT * FROM staff WHERE staffUserName='"+user+"'";
			
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			ArrayList<String> staffDetails = new ArrayList<>();
			
			if(rs1.next()) {
				staffDetails.add(rs1.getString("staffName"));
				staffDetails.add(rs1.getString("staffAddress"));
				staffDetails.add(rs1.getString("staffEmail"));
				staffDetails.add(rs1.getString("staffGender"));
				staffDetails.add(rs1.getString("staffUserName"));
				staffDetails.add(rs1.getString("staffPassword"));
				
				return staffDetails;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean updateData(staffModel staff){
		
		try {
			
			String name = staff.getStaffName();
			String address = staff.getStaffAddress();
			String email = staff.getStaffEmail();
			String gender = staff.getStaffGender();
			String user = staff.getStaffUserName();
			String pass = staff.getStaffPassword();
			
			Statement stmt = (Statement) DBConnect.getConnection().createStatement();
			
			String sql2 = "UPDATE staff SET staffName='"+name+"', staffAddress='"+address+"', staffEmail='"+email+"', staffGender='"+gender+"', staffUserName='"+user+"', staffPassword='"+pass+"' WHERE staffUserName ='"+user+"'";
			
			stmt.executeUpdate(sql2);
	        
	        
//	        String name = staff.getStaffName();
//			String address = staff.getStaffAddress();
//			String email = staff.getStaffEmail();
//			String gender = staff.getStaffGender();
//			String user = staff.getStaffUserName();
//			String pass = staff.getStaffPassword();
//			
//			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	public boolean deleteData(staffModel staff) {
		try {
			String username = staff.getStaffUserName();
			String password = staff.getStaffPassword();
			
			String sql = "DELETE FROM staff WHERE staffUserName = '"+username+"' AND staffPassword = '"+password+"';";
			
			Statement stmt = (Statement) DBConnect.getConnection().createStatement();
			
			stmt.executeUpdate(sql);
			
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
}

