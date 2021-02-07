package com.java.OOPS.Abstraction;

abstract class Abstract
{
	 abstract void method();
}
public class AbstractMethods extends Abstract
{
	void method()
	{
		System.out.println("Abstract Methods can be implemented via inheritance- Method Overriding");
	}
	public static void main(String[] args) 
	{
		AbstractMethods am=new AbstractMethods();
		
		am.method();
	}
}
