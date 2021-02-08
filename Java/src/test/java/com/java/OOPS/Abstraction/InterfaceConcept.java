package com.java.OOPS.Abstraction;

interface InterfaceA
{
	int a=10;
	
	void method();
}
class ClassA implements InterfaceA
{
	public void method()
	{
		System.out.println("Interface");
	}
}
public class InterfaceConcept 
{
	public static void main(String[] args) 
	{
		ClassA c=new ClassA();
		
		//InterfaceA a=new ClassA();
		
		System.out.println(c.a);
		
		c.method();
		
	}
}
/*

Interface
-----------

1. An interface is a blueprint of a class. An interface is declared by using the interface keyword. 
	
2. Interface fields are public, static and final by default, and the methods are public and abstract.

3. Java Interface also represents the IS-A relationship.
	
4. Interface cannot be instantiated just like the abstract class.

5. Interface provides total abstraction; means all the methods in an interface are declared with the empty body.
	
Note
-------

A class extends another class, an interface extends another interface, but a class implements an interface.


Why use Java interface?
-------------------------

We use java interface to achieve abstraction and multiple inheritance in Java. 


*/