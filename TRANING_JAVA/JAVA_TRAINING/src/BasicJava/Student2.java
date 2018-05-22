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
 class Student2 {  // This is Class
    int rollno;  
 String name;  
 String department;
   void insertRecord(int r, String n, String d){  //Object instailazation method calling 
  rollno=r;  
  name=n;  
  department=d;
 }  
   void displayInformation()
 {
     System.out.println("Student Details ::"+rollno + "      "+name  + "  " + department);
 }//method  
   public static void main(String args[]){  
  Student2 s1=new Student2();  
  s1.insertRecord(111,"Karan","IT");  
  s1.displayInformation();  
   }   
}
