package ThreadSynchronized;

/*
 * If you declare any method as synchronized, it is known as synchronized method.
 * Synchronized method is used to lock an object for any shared resource.
 * When a thread invokes a synchronized method, 
 * it automatically acquires the lock for that object and releases it when the thread completes its task.
 */

class Table2{  
	synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	 }  
	}  
	class MyThread112 extends Thread{  
	Table2 t;  
	MyThread112(Table2 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread23 extends Thread{  
	Table2 t;  
	MyThread23(Table2 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class Synchronizedmethod{  
	public static void main(String args[]){  
	Table2 obj = new Table2();//only one object  
	MyThread112 t1=new MyThread112(obj);  
	MyThread23 t2=new MyThread23(obj);  
	t1.start();  

	t2.start();  
	}  
	}  