package com.java.OOPS.Abstraction;

interface InterfaceA
{
	int a=10;
	
	void method();
}
class ClassA implements InterfaceA
{
	public void method()
	{
		System.out.println("Interface");
	}
}
public class InterfaceConcept 
{
	public static void main(String[] args) 
	{
		ClassA c=new ClassA();
		
		System.out.println(c.a);
		
		c.method();
		
	}
}
/*

By default variables in interface are static and final 

Abstract methods are public by default,An abstract methods is a method contains definition but not body.

To implement interface methods inside the class we need to specify access modifier as public.

We can create object reference for interface but we cannot instantiate interface

*/