package BasicJava;

public class EmployeeDetails {
	int empid;
	String empname;
	
	void employeeDetails(int eid, String ename)
	{
		empid=eid;
		empname=ename;
	}
	
	void empdetails()
	{
		System.out.println(empid + "      "+empname);
	}
	
public static void main(String args[])
{
	EmployeeDetails emp =new EmployeeDetails();
	emp.employeeDetails(1000, "RAJA");
	emp.empdetails();
}
	
}
