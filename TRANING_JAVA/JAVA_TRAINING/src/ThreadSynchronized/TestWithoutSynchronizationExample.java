package ThreadSynchronized;
class Table{  
	synchronized static void printTable(int n){  
   for(int i=1;i<=10;i++){  
     System.out.println(n*i);  
     try{  
       Thread.sleep(1000);  
     }catch(Exception e){}  
   }  
 } 
}  
class MyThread11 extends Thread{  
public void run(){  
Table.printTable(1);  
}  
}   
class MyThread22 extends Thread{  
public void run(){  
Table.printTable(10);  
}  
}  
 class MyThread33 extends Thread{  
public void run(){  
Table.printTable(100);  
}  
}  
class MyThread44 extends Thread{  
public void run(){  
Table.printTable(1000);  
}  
}  
public class TestWithoutSynchronizationExample{  
public static void main(String args[]){  
MyThread11 t1=new MyThread11();  
MyThread22 t2=new MyThread22();  
MyThread33 t3=new MyThread33();  
MyThread44 t4=new MyThread44();  
t1.start();  
t2.start();  
t3.start();  
t4.start();  
}  
}  
