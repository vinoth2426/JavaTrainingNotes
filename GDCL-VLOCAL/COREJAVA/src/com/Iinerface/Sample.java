package com.Iinerface;

 class Sample {
	void sum()
	{
		System.out.println(" Hi Sum");
	}
}
	class A extends Sample
	{
		void sum()
		{
			System.out.println("HI Div Method");
		}
	
	public static void main(String args[])
	{
    A a=new A();	
   a.sum();
   //a.sum();
	}
}
