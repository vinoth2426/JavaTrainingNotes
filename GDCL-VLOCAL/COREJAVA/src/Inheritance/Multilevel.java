/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
class box1
{
int length;
int width;
int height;
box1(int l,int w,int h)
{
length=l;
width=w;
height=h;
}
box1()
{
length=0;
width=0;
height=0;
}
box1(int l)
{
length=l;
width=l;
height=l;
}
int volume()
{
int v;
v=length*height*width;
return v;
}
}
class boxweight extends box1
{
double weight;
boxweight()
{
super();
weight=0;
}
boxweight(int l,double m)
{
super(l);
weight=m;
}
boxweight(int l,int w,int h,double m)
{
super(l,w,h);
weight=m;
}
}
class shipping extends boxweight
{
double cost;
shipping()
{
super();
cost=0;
}
shipping(int l,double m,double c)
{
super(l,m);
cost=c;
}
shipping(int l,int w,int h,double m,double c)
{
super(l,w,h,m);
cost=c;
}
}
class Multilevel
{
public static void main(String  args[])
{
shipping s1=new shipping(10,5,7,100,150);
double v;
v=s1.volume();
System.out.println("shipment list");
System.out.println("volume weight cost");
System.out.println(+v+" "+s1.weight+"rs"+s1.cost);
}
}


