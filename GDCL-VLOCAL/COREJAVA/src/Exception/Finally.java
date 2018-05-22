/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
/**
 *
 * @author VINOTHVINO
IMP:Java finally block is a block that is used to execute important code such as closing connection, stream etc.
Java finally block is always executed whether exception is handled or not.
Java finally block must be followed by try or catch block.
* Why use java finally

Finally block in java can be used to put "cleanup" code such as closing a file, closing connection etc.

 */
//exception doesn't occur:
/*
class Finally
{
     public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}*/
// exception occurs and not handled:
/*class Finally{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e)
  {System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  */

//exception occurs and handled:
public class Finally{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
} 
/*
NOTE:
Rule: For each try block there can be zero or more catch blocks, but only one finally block.

Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
*/
