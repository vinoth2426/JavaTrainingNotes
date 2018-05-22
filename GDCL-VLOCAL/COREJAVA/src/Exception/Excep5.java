/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
EX:
void m(){  
throw new ArithmeticException("sorry");  
}  
throws:
void m()throws ArithmeticException{  
//method code  
}  
 */
package Exception;
public class Excep5 {
    static void demoproc()
    {
        try
        {
            throw new NullPointerException(" I am Throw");
                 }
        catch(NullPointerException e)
        {
            System.out.println(" Exception Found");
            throw e;
        }
    }
    public static void main(String args[])
    {
        try
        {
            demoproc();
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException"+e);
        }
    }
}
