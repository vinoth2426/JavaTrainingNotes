package DATABASE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTestSelect {
    public static void main(String args[]){
		Connection conn = null;
		Statement statement = null;
		
		String query = "select reg_id, NAME,department from student_cse";
		
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
			
			//create statement
			statement = conn.createStatement();
			
			//execute query
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {				 
				String reg_id = rs.getString("reg_id");
				String name = rs.getString("NAME");
				String department = rs.getString("department");
 
				System.out.println("Reg_id : " + reg_id);
				System.out.println("Name : " + name); 
				System.out.println("Department : " + department);
			}
			
			//close connection
			statement.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
    
}
