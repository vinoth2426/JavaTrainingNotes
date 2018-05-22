package com.Method.Cons;
class vehicle
{
String regno;
int model;
vehicle(String r,int m)
{
regno=r;
model=m;
}
void display()
{
System.out.println("Registration number:"+regno);
System.out.println("Model number:"+model);
}
}
class roadvehicle extends vehicle
{
int noofwheel;
roadvehicle(String r,int m,int n)
{
super(r,m);
noofwheel=n;
}
void display()
{
        super.display();
        System.out.println("nofowheel:"+noofwheel);

}
}
class watervehicle extends vehicle
{
int noofleaf;
watervehicle(String r,int m,int n)
{
super(r,m);
noofleaf=n;
}
void display()
{
System.out.println(regno+" : "+model+" : "+noofleaf);
}
}
public class hierachy
{
public static void main(String args[])
{
roadvehicle r1;
watervehicle w1;
r1=new roadvehicle("TN8106",1,2);
w1=new watervehicle("TN3454",1,12);
r1.display();
w1.display();
}
}
