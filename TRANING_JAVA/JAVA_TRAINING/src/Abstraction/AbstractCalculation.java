package Abstraction;



abstract class Calculation {
	abstract void addition(int a,int b);
	abstract void division(int a,int b);
	abstract void multiplication(int a,int b);
	
	int ab;
	int bc;
	int cd;
	void suntraction(int ab,int bc)
	{
		this.ab=ab;
		this.bc=bc;
		
		int c=ab-bc;
		
		System.out.println("Substaction is "+ c);
	}

	
}
public class AbstractCalculation extends Calculation {
	
	int ab;
	int bc;
	int cd;
	
	void addition(int a,int b)
	{
		ab=a;
		bc=b;
		int c=ab+bc;
		System.out.println("Addition is "+ c);
	}

	void division(int a,int b)
	{
		ab=a;
		bc=b;
		
		int c=a/b;
		
		System.out.println("Divison is "+ c);
	}

	void multiplication(int a,int b)
	{
		ab=a;
		bc=b;
		
		int c=a*b;
		
		System.out.println("Multiplication is "+ c);
	}
	
	public static void main(String args[]){
		
		AbstractCalculation ab=new AbstractCalculation();
		
		ab.addition(100, 200);
		ab.multiplication(250, 350);
		ab.division(1000, 100);
	//	ab.suntraction(250, 550);
	}


}