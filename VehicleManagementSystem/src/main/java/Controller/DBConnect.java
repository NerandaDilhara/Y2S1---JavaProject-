package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/OnlineVehicleManagementSystem";
		String user = "root";
		String pass = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}	
	
}
