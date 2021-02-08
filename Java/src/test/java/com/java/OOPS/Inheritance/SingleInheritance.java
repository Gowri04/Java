package com.java.OOPS.Inheritance;
class SingleA
{
	int a=10;
	void method()
	{
		System.out.println("SingleA Class Method");
	}
}
class SingleB extends SingleA
{
	int b=20;
	void method1()
	{
		System.out.println("SingleB Class Method");
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		SingleB si=new SingleB();
		
		System.out.println(si.a);
		
		System.out.println(si.b);
		
		si.method();
		si.method1();
	}

}
/*
Inheritance

Acquires the properties from one class to another class.
A class which gets inherited is known as Super Class,Base Class,Parent Class.
A class which inherits the properities is known as Sub Class,Derived Class,Child Class.

Child Class can inherit only non static and non private members of Parent Class.
Child Class cannot inherit static,private,constructors.

Single Level Inheritance

In Single Level Inheriatance one class acquires the properties of another class.
It enables a Child Class to inherit the properties from a single Parent Class.

Inheritance

	1. Inheritance is a process where one class inherits the properties of another class.
	2. The main purpose of Inheritance is Code Reusability.
	3. A class which inherits the properties of another class is known as sub class, derived class, child class.
	4. A class which gets inherited is known as super class, base class, parent class.
	5. A class which inherits the another class is known as IS-A relationship or parent child relationship.
	
Why use Inheritance

	1. Code Reusability
	2. Method Overriding(to achieve runtime polymorphism)

class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  

Extends

	1. We use extends keyword to allow the child class to inherit all the properties of the parent class and we can also create new data members and methods. 
	2. If the properties are private then the child class cannot inherit those properties from the parent class.

Implements

	1. We use implements keyword to inherit the properties from an interface. 
	2. Interfaces cannot be extended by the classes.

Types of Inheritance

	1. Single Inheritance
			i. When a class inherits another class is known as Single inheritance
			ii. Example: Class B extends Class A
	2. Multilevel inheritance
			i. When there is a chain of inheritance, it is known as multilevel inheritance. 
			ii. Class C extends Class B and Class B extends Class A
	3. Hierarchical inheritance
			i. When two or more classes inherits a single class, it is known as hierarchical inheritance. 
			ii. Class B, Class C extends Class A
	4. Hybrid inheritance
			i. Combination of more than one type of inheritance.
	5. Multiple Inheritance
			i. When one class inherits multiple classes, it is known as multiple inheritance. 
			ii. Class C extends Class A and Class B




*/