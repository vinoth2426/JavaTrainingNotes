package Exception;
public class Excep2 {
    public static void main(String args[])
    {
        try
         {         int a;
                    int d=0;
                    a=40/d;
                   System.out.println(a);
        }
        
        catch(Exception e)
        {
            System.out.println(" Division by Zero Error:"+e);
        }
       
    }
    
}
