
package com.Iinerface;
interface collegeDetails
{
    void student();
    void staff();
    void department();
    void test1();
   // void test2();
    void employee();
}

interface employeedetails1
{
	void salary();
}

public class InterfaceExasmple  implements collegeDetails,employeedetails1 {
    public void employee()
   {
       System.out.println(" RIT employee");
   }
    public void salary()
   {
       System.out.println(" RIT employee");
   }
    public void employee1()
   {
       System.out.println(" RIT employee");
   }
	public void student()
    {
        System.out.println(" RIT GUYS");
    }
     public void test1()
     {
    	 System.out.println("test");
    	 
     }
   public void staff()
   {
	   System.out.println(" IT STAFF");
   }
    public void department()
   {
	   System.out.println(" IT AND CSE");
   }
    
    public void Details()
    {
    	System.out.println(" Details");
    }
    public void test()
    {
    	System.out.println(" TEASTS");
    }
    
       public static void main(String args[])
        {
            InterfaceExasmple i =new InterfaceExasmple();
            i.staff();
            i.student();
          i.department();
          i.test();
          i.Details();
        
        }
}
 
    

