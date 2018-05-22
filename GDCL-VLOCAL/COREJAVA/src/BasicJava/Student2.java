/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJava;

/**
 *
 * @author VINOTHVINO
 */
public class Student2 {
    int rollno;  
 String name;  
  
 void insertRecord(int r, String n){  //method  
  rollno=r;  
  name=n;  
 }  
  
 void displayInformation()
 {
     System.out.println(rollno);
     System.out.println(name);
 }//method  
  
 public static void main(String args[]){  
  Student2 s1=new Student2();  
  Student2 s2=new Student2();  
  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  
  s1.displayInformation();  
  s2.displayInformation();  
  
 }  
    
}
