package Encapsulation;

public class Test {
	public static void main(String[] args){  
		Student s=new Student();  
		//Address a=new Address();
	//	a.setPincode(100098);
		s.setName("RAJA RAM");
		s.setId(22);
		s.setDepartment("ECE");
		s.setEmail("ABC@gmail.com");
		System.out.println(s.getName());  
		
		System.out.println(s.getId());
		
  	System.out.println(s.getDepartment());
		System.out.println(s.getEmail());
		//System.out.println(a.getPincode());
		}  
}
