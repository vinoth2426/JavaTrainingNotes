package ThreadExample;

public class ThreadTwice  extends Thread{
	
	public void run()
	{
		System.out.println("Thread Running");
	}
	
	public static void main(String args[])
	{
		ThreadTwice t1=new ThreadTwice();
		t1.start();
		t1.start();
	}

}