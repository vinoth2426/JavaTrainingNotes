/*
 * The sleep() method of Thread class is used to sleep a thread for the specified amount of time.
 */

package Thread;
class TestSleepMethod1 extends Thread{  
public void run(){  
for(int i=1;i<5;i++){  
try{
Thread.sleep(1500);
}
catch(Exception e)
{
    System.out.println(e);
}  
System.out.println(i);  
}  
}  
public static void main(String args[]){  
TestSleepMethod1 t1=new TestSleepMethod1();  
TestSleepMethod1 t2=new TestSleepMethod1();
TestSleepMethod1 t3=new TestSleepMethod1();
t1.start();  
t2.start();
t3.start();
}  
}  