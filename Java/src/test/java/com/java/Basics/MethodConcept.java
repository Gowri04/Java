package com.java.Basics;
class Method
{
	static int a=10; //static varaible

	static void method()	//static method
	{
		System.out.println("Static Method");
	}
	
	int b=20;//non static varaible
	
	void method1() //non static method
	{
		System.out.println("Non Static Method");
	}	
}
public class MethodConcept 
{
	static int x=40;
	
	static void method()
	{
		System.out.println("Static Method");
	}
	
	int y=50;
	
	void method1()
	{
		System.out.println("Non Static Method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Method.a);
		
		Method.method();
		
		Method m=new Method();
		
		System.out.println(m.b);
		
		m.method1();	
		
		System.out.println(MethodConcept.x);
		
		MethodConcept.method();
		
		MethodConcept mc=new MethodConcept();
		
		System.out.println(mc.y);
		
		mc.method1();
	}
}
/*

Methods
	
1. Method is a block of code grouped together to perform a certain task or operation. 
2. Method is used to achieve the reusability of code. 
3. The method is executed only when we call or invoke it.
4. Method have a return type and we can control the methods using access modifiers.

Types of Method

	1. Predefined Method or Built in method(method that is already defined in the Java class libraries)
	2. User-defined Method(method written by the user or programmer)


Calling Method: A method which invokes another method.
Called Method: A method which gets invoked.

Case1: No Parameter and No Return value
Case2: No Parameters and Return Value
Case3: Take Parameters and No Return Value
Case4: Take Parameters and Return Value

main() method can be present in a same class.
main() method can be present in a separate class.

*/