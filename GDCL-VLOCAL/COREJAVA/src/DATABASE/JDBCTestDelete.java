package DATABASE;
import java.sql.Connection;
import java.sql.Statement;

public class JDBCTestDelete {
   public static void main(String args[]){
		Connection conn = null;
		Statement statement = null;
		String query = "DELETE FROM employee WHERE EMPLOYEE_ID=1";
		
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
			
			System.out.println("Record deleted successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	 
}
