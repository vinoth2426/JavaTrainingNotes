package Thread;
public class Multi3Runnable  implements Runnable {
public void run(){  
System.out.println("thread is running...");  } 
public static void main(String args[]){  
Multi3Runnable m1=new Multi3Runnable();  
Thread t1 =new  Thread(m1);  
t1.start();  }  
}
