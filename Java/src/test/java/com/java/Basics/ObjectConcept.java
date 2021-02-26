package com.java.Basics;
class Object
{
	int a=10;
	
	void method()
	{
		System.out.println("Method");
	}
}
public class ObjectConcept 
{
	public static void main(String[] args) 
	{
		Object object=new Object();
		
		System.out.println(object.a);
		
		object.method();
	}
}
