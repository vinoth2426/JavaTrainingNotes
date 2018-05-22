package equals;

public class Equals {

	public static void main(String[] args) {
		String obj=new String("VINOTH");
		String obj1=new String("VINOTH");
		if(obj.equals(obj1))
			//if(obj==obj1)
        System.out.println("obj==obj1 is true");
		else
		System.out.println("obj==obj1 is false");
	}
}