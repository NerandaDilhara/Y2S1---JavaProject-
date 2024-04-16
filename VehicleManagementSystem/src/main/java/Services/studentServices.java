package Services;

import java.sql.ResultSet;
import java.sql.Statement;

import Controller.DBConnect;
import Model.StudentModel;

public class studentServices {

	public void insertData(StudentModel stdModel) {
		try {
			
			String name = stdModel.getStdName();
			String email = stdModel.getStdEmail();
			String user = stdModel.getStdUser();
			String pass = stdModel.getStdPass();
			
			DBConnect db = new DBConnect();
			
			Statement stmt = db.getConnection().createStatement();
			
			String sql = "INSERT INTO student VALUES('"+0+"', '"+name+"', '"+email+"', '"+user+"', '"+pass+"')";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate(StudentModel stdModel) {
		try {
			String user = stdModel.getStdUser();
			String pass = stdModel.getStdPass();
			
			DBConnect db = new DBConnect();
			
			String sql = "SELECT * FROM student WHERE username = '"+user+"' AND password = '"+pass+"'";
			
			Statement stmt = db.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs != null) {
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
	
	public void updateData() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
