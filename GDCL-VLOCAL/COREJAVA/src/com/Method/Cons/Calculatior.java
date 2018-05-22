package com.Method.Cons;
public class Calculatior {
    
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sum(long a,long b)
    {
         System.out.println(a+b);
    }
    public static void main(String args[])
    {
        Calculatior c1=new Calculatior();
        c1.sum(10, 10);
        c1.sum(100000000, 1000000);
    }
}
