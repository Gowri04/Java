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
------------------------------------------------------

1. To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

2. Consider a scenario where A, B, and C are three classes. 

3. The C class inherits A and B classes.
 
4. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

5. Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. 

6. So whether you have same method or different, there will be compile time error.

class A
{  
	void msg()
	{
		System.out.println("Hello");
	}  
}  
class B
{  
	void msg()
	{
		System.out.println("Welcome");
	}  
}  
class C extends A,B
{    
 public static void main(String args[])
 {  
   C obj=new C();  
   
   obj.msg();//Now which msg() method would be invoked?  
 }  
}  

If we can't achieve multiple inheritance in java then how can we achieve?
-------------------------------------------------------------------------

We can achieve multiple inheritance using interface concept by implement multiple interfaces in a class. 

In java, one class can implements two or more interfaces.


*/