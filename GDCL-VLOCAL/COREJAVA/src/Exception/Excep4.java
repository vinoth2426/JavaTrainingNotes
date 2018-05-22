/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
/**
 *
 * @author VINOTHVINO
 */
public class Excep4 {
    public static void main(String args[])
    {
        try
        {
             int a=0;
              a=args.length;
            System.out.println("a="+a);
             int b=10/a;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException "+e);
            
        }           
        try
        {
            int c[]={1};
            c[30]=20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException"+e);
        }    
        }
    }
    

