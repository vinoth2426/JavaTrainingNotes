package BasicJava;
 class C {
void disp()
{
	System.out.println("Hai");
}

}
class B extends C
{
	void Hai()
	{
		System.out.println("WELCOME");
	}
}
 public class Single
{
	public static void main(String args[])
	{
		B h=new B();
		h.disp();
		h.Hai();
	}
	}


