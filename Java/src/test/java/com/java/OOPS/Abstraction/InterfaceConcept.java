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
		
		//InterfaceA a=new ClassA();
		
		System.out.println(c.a);
		
		c.method();
		
	}
}