package BasicJava;
abstract class Abstract 
{
	abstract void run();
	abstract void disp();
	}
   class inner extends Abstract 
 {
	void run()
	{

       System.out.println("abstract method");
       
	}

   void disp()
   {
	   
	   System.out.println("void disp");
   }
   
 
   
   public static void main(String args[])
   {
	   inner  i=new inner();
	   i.run();
	   i.disp();
   }
 }
   
	
