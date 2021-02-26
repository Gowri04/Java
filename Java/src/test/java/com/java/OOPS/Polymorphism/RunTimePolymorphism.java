package com.java.OOPS.Polymorphism;

class RuntimeA
{
	void method()
	{
		System.out.println("RuntimeA method");
	}
}
class RuntimeB extends RuntimeA
{
	@Override
	void method()
	{
		System.out.println("RuntimeB method");
	}
}
public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		RuntimeB mo=new RuntimeB();
		
		mo.method();
	}
}