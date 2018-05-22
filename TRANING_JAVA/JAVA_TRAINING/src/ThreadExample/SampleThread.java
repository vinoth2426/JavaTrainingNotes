package ThreadExample;

public class SampleThread  extends Thread{
	
	public void run()
	{
		System.out.println("I am One");
	}

	public static void main(String args[])
	{
		SampleThread t1=new SampleThread();
		//SingleTaskMultiThread t1=new SingleTaskMultiThread();
		
		t1.start();
	t1.start();
	}
}
