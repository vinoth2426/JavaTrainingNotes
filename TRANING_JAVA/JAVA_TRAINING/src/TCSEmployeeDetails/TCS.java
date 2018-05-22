package TCSEmployeeDetails;

public class TCS {
	
	public static void main(String args[])
	{
		EmployeeDetails e=new EmployeeDetails();
		
		EmployeeAddress ad= new EmployeeAddress();
		
		e.setEmployee_id("TCS1000");
		e.setEmployee_Name("RAMU");
		e.setSalary(36000);
		ad.setCity("CHENNAI");
		ad.setStreet("T NGAR");
		
		System.out.println("EMPLOYEE ID IS" + e.getEmployee_id());
	}

}
