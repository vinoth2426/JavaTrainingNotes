package com.Iinerface;

interface TCS
{
	void department();
	void projects();
}



public class EmployeeDetails  implements TCS{
	
	public void department()
	{
		System.out.println("ALL DEPARTMENT");
	}

	public void projects()
	{
		System.out.println("SHIPPING PROJECTS");
	}
	
	public void test()
	{
		System.out.println("Test");
	}
	
	public static void main(String args[])
	{
		EmployeeDetails e=new EmployeeDetails();
		e.department();
		e.projects();
		e.test();
	}
}
