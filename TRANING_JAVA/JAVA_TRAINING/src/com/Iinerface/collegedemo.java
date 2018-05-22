package com.Iinerface;
interface college
{
final static int noofprincipal=1;
void office();
void student();
}
interface staff
{
void department();
}
class student
{
int noofstudent;
student(int ns)
{
noofstudent=ns;
}
}
class polytech extends student implements college,staff
{
int noofteachstaff,noofdepart;
int noofnonteachstaff;
polytech(int nstaff,int ns,int ndepart,int nntstaff)
{
super(ns);
noofteachstaff=nstaff;
noofdepart=ndepart;
noofnonteachstaff=nntstaff;
}
public void office()
{
System.out.println("office");
System.out.println("number of non teach staff:>>>>>>>>>>>>"+noofnonteachstaff);
}
public void department()
{
System.out.println("department");
System.out.println("number of teaching staff:"+noofteachstaff);
System.out.println("number of department:"+noofdepart);
System.out.println("number of principal:"+noofprincipal);
}
public void student()
{
System.out.println("student");
System.out.println("number of student:"+noofstudent);
}
}
public class collegedemo
{
public static void main(String arg[])
{
polytech govt=new polytech(65,1000,10,40);
polytech sun=new polytech(45,590,5,30);
govt.office();
govt.department();
govt.student();
sun.office();
sun.department();
sun.student();
}
}

