/*
 
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
class rectangle  // parent class
{
int length;
int breadth;
rectangle(int l,int b)
{
length=l;
breadth=b;
}
int area()
{
int a;
a=length*breadth;
return a;
}
}
class box extends rectangle   // child class
{
int height;
box(int l,int b,int h)
{
super(l,b);
height=h;
}
int volume()
{
int v;
v=length*breadth*height;
return v;
}
}
class single
{
public static void main(String args[])
{
box b1=new box(12,3,10);
int ab,vb; 
ab=b1.area();
vb=b1.volume();
System.out.println("area="+ab);
System.out.println("volume="+vb);
}
}
