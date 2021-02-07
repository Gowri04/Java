package com.java.OOPS.Inheritance;

interface MultipleA
{
	void method1();
}
interface MultipleB 
{
	void method2();
}
class MultipleC implements MultipleB, MultipleA
{
	public void method1()
	{
		System.out.println("Interface Method 1");
	}
	public void method2()
	{
		System.out.println("Interface Method 2");
	}
}
public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		MultipleC mi=new MultipleC();
		
		mi.method1();
		mi.method2();
	}
}
