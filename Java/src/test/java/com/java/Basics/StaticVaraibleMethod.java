package com.java.Basics;
public class StaticVaraibleMethod
{
	static int a=10;
	
	static void method()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) 
	{
		System.out.println(StaticVaraibleMethod.a);		
				
		StaticVaraibleMethod.method();		
	}
}
/*

Example:
If we have same variables name with same value and same type in all the objects. 
Problem1: Every object will occupy certain amount of space in memory.
Problem2: If we change the value in one object it will not reflect in other objects.
To overcome this problem we use static keyword.

Static is a keyword used in java for memory management.
Static methods or variables are accessed via classname.
Static keyword is used with variables(class variables) and methods(class method).
Static method can access static variables and static methods directly.
Static method can access non static variables and non static methods by creating an object.
Static methods or variables created in the class area.
ClassLoader.
One Copy.
Class Level Members.


Non Static method can access both static and non static methods or variables.
Non Static members are accessed via Object.
Non Static members are created in Heap Area.
JVM.
Multiple Copies.
Instance Members.



*/