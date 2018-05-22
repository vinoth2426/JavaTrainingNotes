package Inheritance;
class Staff{
	String name;
	int id;
	
	Staff(String n,int i)
	{
		name=n;
		id=i;
	}
	
	void disp()
	{
		System.out.println(name+"    "+id);
	}
	
}

class Nonstaff extends Staff
{
	String city;
	
	Nonstaff(String n,int i,String c)
	{
		super(n,i);
		city=c;
	}
	
	void disp()
	{
		System.out.println(name+id+city);
	}
	
	
}
class TeachStaff extends Nonstaff
{
	String college;
	TeachStaff(String n,int i,String c,String col)
	{
		super(n,i,c);
		college=col;
	}
	void disp()
	{
		System.out.println(name+"   "+id+"   "+city+"   "+college);
	}
}
class Emp extends TeachStaff
{
	String Country;
	Emp(String n,int i,String c,String col,String co)
	{
		super(n,i,c,col);
		Country=co;
	}
	void disp()
	{
		System.out.println(name+"   "+id+"   "+city+"   "+college+"   "+Country);
	}
}
class Multilevel1
{
	public static void main(String args[])
	{
		Emp n=new Emp("ARUN",100,"CHENNAI","SRM","INDIA");
		Emp n1=new Emp("VINOTH",102,"Mumbai","SRM","INDIA");
		n.disp();
		n1.disp();
	}
}