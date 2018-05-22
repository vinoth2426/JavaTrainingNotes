package Constructor;


/*
 * VINOTH
 */
class Student4
{  
    int id;  
   
    Student4(int i)
    {
    	id=i;
    }
      
    void dispaly()
    {
    	System.out.println("Emp ID "+id);
    }
   
    public static void main(String args[])
    {
    	Student4 s1=new Student4(100);
    	s1.dispaly();
    }
}  