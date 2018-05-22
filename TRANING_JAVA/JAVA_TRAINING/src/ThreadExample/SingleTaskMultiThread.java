package ThreadExample;

public class SingleTaskMultiThread extends Thread {
	
	public void run()
	{
		System.out.println("I am One");
	}

	public static void main(String args[])
	{
		SingleTaskMultiThread t1=new SingleTaskMultiThread();
		SingleTaskMultiThread t2=new SingleTaskMultiThread();
		
		t1.start();
		t2.start();
	
	}
}
