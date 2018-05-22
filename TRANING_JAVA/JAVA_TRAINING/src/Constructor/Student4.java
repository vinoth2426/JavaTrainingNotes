package Constructor;

/*
 * VINOTH
 */
class Student4 {
	int id;
	String name;

	Student4(int i, String n) {
		id = i;
		name = n;
	}

	void dispaly() {
		System.out.println("Emp ID " + id);
		System.out.println("Emp NAME " + name);
	}

	public static void main(String args[]) {
		Student4 s1 = new Student4(1000, "RAJA");
		Student4 s2 = new Student4(2000, "RAM");
		s1.dispaly();
		s2.dispaly();
	}
}