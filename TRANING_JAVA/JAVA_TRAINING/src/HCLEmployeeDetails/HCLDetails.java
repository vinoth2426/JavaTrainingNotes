package HCLEmployeeDetails;

public class HCLDetails {
	
	public static void main(String args[])
	{
		EmployeeDetails e=new EmployeeDetails();
		AddressDetails a=new AddressDetails();
		
		e.setEmpName("RAJA RAM");
		e.setEmpId(826579);
		e.setSalary(40000);
		a.setStreetName("CIT NAGAR");
		a.setLandMark("SARAVANA STORES");
		a.setCity("CHENNAI");
		
		System.out.println("Employee Name is :"+e.getEmpName());
		System.out.println("Employee ID is :"+e.getEmpId());
		System.out.println("Employee Salary is :"+e.getSalary());
		System.out.println("Employee Street is :"+a.getStreetName());
		System.out.println("Employee Land Mark  is :"+a.getLandMark());
		System.out.println("Employee City is :"+a.getCity());
		
		
	}

}
