package BasicJava;
public class Employee {
	int empno;
	String EmpName;

	void employeeDetails(int e, String emp) {// insitalize the object
		empno = e;
		EmpName = emp;
	}

	void display() {
		System.out.println(">>>>>EMP NO::" + empno);
		System.out.println("EMP NAME::" + EmpName);
	}

	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		// Employee e2=new Employee();
		e1.employeeDetails(20000, "RAMM");
		e1.display();

		e2.employeeDetails(5000, "RAJA");
		e2.display();
	}
}
