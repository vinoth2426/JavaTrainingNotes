/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJava;

import java.util.Scanner;

/**
 *
 * @author VINOTHVINO
 */
public class Hello {
    
   public static void main(String args[])
   {
	   int a;
	      float b;
	      String s;
	 
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string");
	      s = in.nextLine();
	      System.out.println("You entered string "+s);
	 
	      System.out.println("Enter an integer");
	      a = in.nextInt();
	      System.out.println("You entered integer "+a);
	 
	      System.out.println("Enter a float");
	      b = in.nextFloat();
	      System.out.println("You entered float "+b);   
	   
   }
   
}
