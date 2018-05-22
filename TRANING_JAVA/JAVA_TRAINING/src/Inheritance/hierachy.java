package Inheritance;

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
System.out.println("Registration no:"+regno);
System.out.println("model:"+model);
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
System.out.println("road vehicle");
//super.display();
System.out.println("Registration no:"+regno);
System.out.println("model:"+model);
System.out.println("no of wheel"+noofwheel);
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
System.out.println("water vehicle");
//super.display();
System.out.println("Registration no:"+regno);

System.out.println("model:"+model);
System.out.println("no of leaf:"+noofleaf);
}
}
 class hierachy
{
public static void main(String args[])
{
roadvehicle r1 =new roadvehicle("TN8106",1,2);
watervehicle w1=new watervehicle("TN3454",1,12);


r1.display();
w1.display();
}
}
