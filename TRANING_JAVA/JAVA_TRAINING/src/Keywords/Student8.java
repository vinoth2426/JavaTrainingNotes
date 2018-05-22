package Keywords;

/*
The static keyword in java is used for memory management mainly.
 We can apply java static keyword with variables, methods, blocks and nested class. 
 The static keyword belongs to the class than instance of the class
ADV:
It makes your program memory efficient (i.e it saves memory).
*/
class Student8 {
	int rollno;
	String name;
	static String college = "SRM";
	static String dept = "ECE";

	Student8(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayDetails() {
		System.out.println(rollno + " " + name + " " + college + " " + dept);
	}

	public static void main(String args[]) {
		Student8 s1 = new Student8(111, "VVVVV");
		Student8 s2 = new Student8(121, "XXXXXX");
		Student8 s3 = new Student8(131, "ZZZZZZZ");

		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
}