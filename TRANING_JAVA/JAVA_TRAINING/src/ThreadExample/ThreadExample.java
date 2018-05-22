package ThreadExample;
class ImplementsRunnable implements Runnable
{
	private int counter=0;
	public void run()
	{
		counter++;
		System.out.println("ImplementsRunnable : Couunter "+counter);
	}
}
class ExtendsThread extends Thread
{
	private int counter=0;	
	public void run()
	{
		counter++;
		System.out.println("ExtendsThread : Couunter "+counter);
	}
}
public class ThreadExample {
public static void main(String arg[])
{
	ImplementsRunnable rc=new ImplementsRunnable();
	   Thread t1=new Thread(rc);
	    t1.start();
	   	Thread t2=new Thread(rc);
		t2.start();
		Thread t3=new Thread(rc);
		t3.start();
		
		ExtendsThread ec1=new ExtendsThread();
		ec1.start();
		ExtendsThread ec2=new ExtendsThread();
		ec2.start();
		ExtendsThread ec3=new ExtendsThread();
		ec3.start();
}	
}
