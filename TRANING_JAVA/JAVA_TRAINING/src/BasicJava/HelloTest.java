package BasicJava;

public class HelloTest {

	
int a;
int b;
int c;

void disp()//METHOD
{
	int a=20;
	int b=2;
	c=a+b;
	
	System.out .println(c);
			
}

void disp1()//METHOD
{
	int a=20;
	int b=2;
	c=a-b;
	
	System.out .println(c);
			
}
	
public static void main(String args[])
{
	HelloTest ab=new HelloTest();
	ab.disp();
	ab.disp1();
}


}
