
package DATABASE;
import java.sql.Connection;
import java.sql.Statement;
public class JDBCTest {
	public static void main(String args[]){
		Connection conn = null;
		
		
		String query = "create table Employee("
			+ "EMPLOYEE_ID int(5), "
			+ "NAME VARCHAR(20), "
			+ "SALARY int(10) )";
			
		
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
			
			//create statement
			Statement statement = conn.createStatement();
			
			//execute query
			statement.execute(query);
			
			//close connection
			statement.close();
			conn.close();
			
			System.out.println("Table created successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}
