
package com.Iinerface;
interface collegeDetails
{
    void student();
    void staff();
    void department();
}

public class InterfaceExasmple  implements collegeDetails {
     public void student()
    {
        System.out.println(" RIT GUYS");
    }
   public void staff()
   {
	   System.out.println(" IT STAFF");
   }
    public void department()
   {
	   System.out.println(" IT AND CSE");
   }
    
       public static void main(String args[])
        {
            InterfaceExasmple i =new InterfaceExasmple();
            i.staff();
            i.student();
          i.department();
        
        }
}
 
    

