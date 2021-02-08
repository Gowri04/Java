package com.java.OOPS.Inheritance;
class HierarchicalA
{
	void method1()
	{
		System.out.println("HierarchicalA");
	}
}
class HierarchicalB extends HierarchicalA
{
	void method2()
	{
		System.out.println("HierarchicalB");
	}
}
class HierarchicalC extends HierarchicalA
{
	void method3()
	{
		System.out.println("HierarchicalC");
	}
}
public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		HierarchicalB hb=new HierarchicalB();
				
		hb.method1();
		hb.method2();
		
		HierarchicalC hc=new HierarchicalC();
		
		hc.method3();
		hc.method1();
	}
}
