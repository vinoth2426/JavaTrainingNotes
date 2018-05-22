
package Abstraction;
abstract class Abstract {
    abstract void run();
    abstract void disp();
   abstract void disp1();
    void disp2()
    {
    	 System.out.println("Print Method calling");
    }
      void print()
      {
    	  System.out.println("Print Method calling");
      }
      
      
      void print1()
      {
    	  System.out.println("Print Method calling");
      }
      
   
  }
class Im extends Abstract
{
    void run()
    {
        System.out.println(" Abstract Method");
    }
    void disp1()
    {
        System.out.println(" Abstract Method");
    }
    void disp()
    {
    	System.out.println(" Void Disp ");
    }
    public static void main(String args[]) 
    {
        Im i=new Im();
       i.run();
       i.disp();
       //i.print();
    }
}