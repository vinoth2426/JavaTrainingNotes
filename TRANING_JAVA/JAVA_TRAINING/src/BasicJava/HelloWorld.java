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
/*public class HelloWorld {
    //public:Access Specifier
    // static:Access Modifier
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}*/

public class HelloWorld
{
void print()// method
{
int a=10;
int b=20;
int c;
c=a+b;
System.out.println("Addition"+c);
}

void print1()// method
{
int a=10;
int b=20;
int c;
c=b-a;
System.out.println("SUBTRACTION"+c);
}


public static void main(String args[])
{
HelloWorld atoz=new HelloWorld();
atoz.print();
atoz.print1();

}
}