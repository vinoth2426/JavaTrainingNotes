package Exception;
public class Excep6 {  
    static void throwone() throws NullPointerException
    {
        System.out.println(" I AM Null");
                throw new NullPointerException("Demo");
    }
    public static void main(String args[])
    {
        try
        {
         throwone();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught"+e);
        }
    }
}
