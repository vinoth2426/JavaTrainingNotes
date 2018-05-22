package DATABASE;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCTestUpdate {
    public static void main(String args[]){
		Connection conn = null;
		Statement statement = null;
		
		String query = "update employee set " +
		"NAME = 'LAKSHMI' " + 
		"where EMPLOYEE_ID = 1 ";
		
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
			
			//create statement
			statement = conn.createStatement();
			
			//execute query
			statement.executeUpdate(query);
			
			//close connection
			statement.close();
			conn.close();
			
			System.out.println("Record updated successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
    
}
