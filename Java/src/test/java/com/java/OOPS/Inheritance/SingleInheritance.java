package com.java.OOPS.Inheritance;
class SingleA
{
	int a=10;
	void method()
	{
		System.out.println("SingleA Class Method");
	}
}
class SingleB extends SingleA
{
	int b=20;
	void method1()
	{
		System.out.println("SingleB Class Method");
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		SingleB si=new SingleB();
		
		System.out.println(si.a);
		
		System.out.println(si.b);
		
		si.method();
		si.method1();
	}

}