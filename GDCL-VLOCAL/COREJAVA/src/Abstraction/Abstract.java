
package Abstraction;
abstract class Abstract {
    abstract void run();
    abstract void disp();
      void print()
    {
        System.out.println("Hello");
    }
  }
class Im extends Abstract
{
    void run()
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
     // i.print();
    }
}