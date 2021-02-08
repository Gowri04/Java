package com.java.OOPS.Inheritance;
class MultiA
{
	void method1()
	{
		System.out.println("Multi Level Inheritance A");
	}
}
class MultiB extends MultiA
{
	void method2()
	{
		System.out.println("Multi Level Inheritance B");
	}
}
class MultiC extends MultiB
{
	void method3()
	{
		System.out.println("Multi Level Inheritance C");
	}
}
public class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{	
		MultiC mi=new MultiC();
		
		mi.method1();
		mi.method3();
		mi.method2();
	}
}
