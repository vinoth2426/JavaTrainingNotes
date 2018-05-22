package DATABASE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTestSelect {
    public static void main(String args[]){
		Connection conn = null;
		Statement statement = null;
		
		String query = "select EMPLOYEE_ID, NAME,SALARY from employee";
		
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
			
			//create statement
			statement = conn.createStatement();
			
			//execute query
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {				 
				String empId = rs.getString("EMPLOYEE_ID");
				String empName = rs.getString("NAME");
				String sal = rs.getString("SALARY");
 
				System.out.println("EmpId : " + empId);
				System.out.println("EmpName : " + empName); 
				System.out.println("Salary : " + sal);
			}
			
			//close connection
			statement.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
    
}
