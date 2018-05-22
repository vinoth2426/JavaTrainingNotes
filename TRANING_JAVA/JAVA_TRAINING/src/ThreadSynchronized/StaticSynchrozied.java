package ThreadSynchronized;

class TableDetails{  
	synchronized  static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 } 
	}  
	class MyThread111 extends Thread{  
	public void run(){  
		TableDetails.printTable(1);  
	}  
	}   
	class MyThread222 extends Thread{  
	public void run(){  
		TableDetails.printTable(10);  
	}  
	}  
	 class MyThread333 extends Thread{  
	public void run(){  
		TableDetails.printTable(100);  
	}  
	}  
	class MyThread444 extends Thread{  
	public void run(){  
		TableDetails.printTable(1000);  
	}  
	}  
	public class StaticSynchrozied{  
	public static void main(String args[]){  
	MyThread111 t1=new MyThread111();  
	MyThread222 t2=new MyThread222();  
	MyThread333 t3=new MyThread333();  
	MyThread444 t4=new MyThread444();  
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	}  

