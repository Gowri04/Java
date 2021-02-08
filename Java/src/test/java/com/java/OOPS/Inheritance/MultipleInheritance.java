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
/*


Why multiple inheritance is not supported in java?

1. To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
2. Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
3. Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.



*/