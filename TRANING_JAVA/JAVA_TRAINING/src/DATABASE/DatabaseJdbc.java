/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseJdbc {   
        public static void main(String args[]){
		
    try{
			//Register the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			
			 //Open the connection
			 Connection conn = DriverManager.
			getConnection("jdbc:mysql://localhost:3306/rit", "root", "admin");
			
			if(conn != null){
				System.out.println("Successfully connected.");
			}else{
				System.out.println("Failed to connect.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
    
}
