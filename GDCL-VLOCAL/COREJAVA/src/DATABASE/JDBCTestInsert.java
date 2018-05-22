/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.Connection;
import java.sql.Statement;


/**
 * This class is used to insert a record in DB table.
 * @author javawithease
 */
public class JDBCTestInsert {
	public static void main(String args[]){
		Connection conn = null;
	
		
		String query = "insert into employee " +
		"(EMPLOYEE_ID, NAME, SALARY) " +
		"values (1, 'KALAI', 20000)";
               
		
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
			
			//create statement
			Statement	statement = conn.createStatement();
			
			//execute query
			statement.executeUpdate(query);
			
			//close connection
			statement.close();
			conn.close();
			
			System.out.println("Record inserted successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
