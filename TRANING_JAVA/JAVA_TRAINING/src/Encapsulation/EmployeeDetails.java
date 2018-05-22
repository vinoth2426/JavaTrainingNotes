package Encapsulation;

public class EmployeeDetails {
	
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setEmpname("RAJA");
		e.setEmpid(883260);
		e.setSalary(36000);
		e.setCity("CHENNAI");
		
		Address a=new Address();
		a.setPincode(1000000);
		a.setStreet("CHENAI");
		System.out.println(""+a.getPincode());
		System.out.println("Emp Name"+e.getEmpname());
		System.out.println("Emp Id"+e.getEmpid());
		System.out.println(e.getSalary());
		System.out.println(e.getCity());
		
	}

}
