package com.java.OOPS.Inheritance;
interface HybridA
{
	void method1();
}
class HybridClassA implements HybridA
{
	public void method1() 
	{
		System.out.println("Hybrid Class A Method 1");
	}
}
class HybridClassB extends HybridClassA
{
	public void method2() 
	{
		System.out.println("Hybrid Class B Method 2");
	}
}
class HybridClassC extends HybridClassB
{
	public void method3() 
	{
		System.out.println("Hybrid Class C Method 3");
	}
}
class HybridClassD extends HybridClassA
{
	public void method4() 
	{
		System.out.println("Hybrid Class D Method 4");
	}
}
public class HybridInheritance 
{
	public static void main(String[] args)
	{
		

	}
}
