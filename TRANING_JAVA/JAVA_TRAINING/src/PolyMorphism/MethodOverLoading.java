/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyMorphism;

/**
 *poly(many) morphism(behaviour)
 * @author VINOTHVINO
 */

/*
 * If a class has multiple methods having same name 
 * but different in parameters, it is known as Method Overloading.
 * 
 * Different ways to overload the method

There are two ways to overload the method in java

By changing number of arguments
By changing the data type
 */
public class MethodOverLoading {
    //compile time=method overloading
    //runtime=method overRiding
    void test(int a)
    {
        System.out.println(a);
    }
    void test(double a,double b)
    {
        System.out.println(a +"  "+b);
      //  System.out.println(b);
    }
    void test(int a,int b,int c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

        public static void main(String args[])
        {
          MethodOverLoading ob=new MethodOverLoading();
         // ob.test();
          ob.test(10);
          ob.test(10,20);
          ob.test(20,30,50);
        }
    }

