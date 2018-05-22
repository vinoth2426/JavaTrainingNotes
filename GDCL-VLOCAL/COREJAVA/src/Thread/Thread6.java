package Thread;
 class sample
    {
	  void compute(int n)
         {
		  synchronized(this)
		  {
           
                    for(int i=1;i<=5;i++)
            {
                System.out.println(n*i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        }}
    class MyThread1 extends Thread


{
sample s;
MyThread1(sample s1)
        {
    this.s=s1;
        }
public void run()
        {
    s.compute(5);
        }
}
    class MyThread2 extends Thread
    {
      sample s;
        MyThread2(sample s1)
        {
           this.s=s1;

        }
    public void run()
        {
        s.compute(100);
        }
    }
  
public class Thread6

{
public static void main(String args[])
        {
    sample s=new sample();
            
        MyThread1 t1=new MyThread1(s);
      MyThread2 t2=new MyThread2(s);
        t1.start();
      t2.start();
            }

            }


