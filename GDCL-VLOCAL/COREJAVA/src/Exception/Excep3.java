package Exception;

/**
 *
 * @author VINOTHVINO
 */
public class Excep3 {
    public static void main(String args[])
    {
        try{   
        	 int c[]={2};
             c[30]=20;
             int a=args.length;
               a=0;
              int b=10/a;
            System.out.println("a="+a);
                      
             }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero:"+e);
        }
       catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println("ArrayIndexOutOfBoundsException:"+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        }
  }
