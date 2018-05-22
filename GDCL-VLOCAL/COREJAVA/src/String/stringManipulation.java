/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author VINOTHVINO
 */
public class stringManipulation {
   public static void main(String args[])
   {
       String v1=new String("Gowtham");
       String v2=new String("Saravanan  ");
       String v3=new String("RAM");
       System.out.println("String1"+v1);
       System.out.println("String2"+v2);
       System.out.println("Strl lowercase:"+v1.toLowerCase());
       System.out.println("Str1 UpperCase:"+v1.toUpperCase());
       System.out.println("Str2 LowerCase:"+v2.toLowerCase());
       System.out.println("Str2 UpperCase:"+v2.toUpperCase());
       System.out.println("str2 replace 'a' into '*':"+v2.replace('a', '*'));
       System.out.println("Concontentaion of String1 and String2:"+v1.concat(v2));
       System.out.println("Trim"+(v1.trim()).concat(v2));
       System.out.println("Str1 and str2 equal:"+v1.equals(v2));
       System.out.println("Str1 and str2 equals IgnoreCase:"+v1.equalsIgnoreCase(v2));
       System.out.println("Str1 Length:"+v1.length());
       System.out.println("Str1 in 2 position Substring:"+v1.substring(2));
       System.out.println("Str1 in 2 to 4th position:"+v1.substring(2, 4));
       System.out.println("Str2 Index of a:"+v2.indexOf('a'));
       
       
       
   }
}
