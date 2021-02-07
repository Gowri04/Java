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
/*
Object is a real world entity that has its own State and Behavior.
Object is an copy of a class that contains all non static members.

Syntax for creating Object:

classname variable=new classname();

variable= Reference Variable or Object Variable
new- Allocate Memory
classname()- Constructor call

*/
