package Services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controller.DBConnect;
import Model.fuelModel;

public class fuelServices {
	
	public ArrayList showData(fuelModel fuel) {
		
		ArrayList fuelDetails = new ArrayList();
		
		try {
			
			Statement stmt = DBConnect.getConnection().createStatement();
			String sql = "SEELECT * FROM fuel";
			ResultSet rs1 = stmt.executeQuery(sql);
			
			while(rs1.next()) {
				fuelDetails.add(rs1.next());
			}
			
			return fuelDetails;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
