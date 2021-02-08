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
		
		System.out.println(c.a);
		
		c.method();
		
	}
}
/*

By default variables in interface are static and final 

Abstract methods are public by default,An abstract methods is a method contains definition but not body.

To implement interface methods inside the class we need to specify access modifier as public.

We can create object reference for interface but we cannot instantiate interface


Interface
	1. An interface in Java is a blueprint of a class. It has static constants and abstract methods.
	2. There can be only abstract methods and varables in the Java interface, not method body.
	3. Interface is used to achieve abstraction and multiple inheritance in Java.
	4. Java Interface also represents the IS-A relationship.
	5. In interface we have default, static amd private methods.
	6. It cannot be instantiated just like the abstract class.
	7. An interface is declared by using the interface keyword.
	8. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. 
	9. A class that implements an interface must implement all the methods declared in the interface.
	10. Interface fields are public, static and final by default, and the methods are public and abstract.


 a class extends another class, an interface extends another interface, but a class implements an interface.

Why use Java interface?
It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.





*/