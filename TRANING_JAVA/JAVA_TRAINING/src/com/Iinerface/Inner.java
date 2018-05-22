
package com.Iinerface;
interface college1
{
    void student();
    void staff();
    void department();
    void developer();
    void developerTesting();
    //void a1(); 
    
}
interface emp
{
	void college();
}
public class Inner implements college1,emp {
	
	public void developerTesting() {
		// TODO Auto-generated method stub
		
	}
	public void developer()
	{
		
	}
   public void student()
    {
        System.out.println(" Hi  Student");
    }
   public void employee()
   {
	   System.out.println(" Hi  Employee");
   }
   public void college()
   {
	   System.out.println(" Hi  college");
   }
   public void hai()
   
   {
	   System.out.println(" Hi  HAI METHOD");
   }
public void department()
{
	System.out.println(" Hi COLLEGE DEPARTMENT");
}
    public void staff()
    {
        {
        System.out.println(" Hi  Student");
                }}
        public static void main(String args[])
        {
            Inner i =new Inner();
            i.staff();
            i.student();
          i.department();
          i.employee();
          i.hai();
         i.college();
        }
    }

