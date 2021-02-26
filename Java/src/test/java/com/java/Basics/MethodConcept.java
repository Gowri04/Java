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