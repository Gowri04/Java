package com.java.Basics;

class ConstrutorClass
{
	ConstrutorClass()
	{
		System.out.println("Non Parameterized Constructor");
	}
	ConstrutorClass(int a, int b)
	{
		System.out.println("Parameterized Constructor");
	}
}
public class ConstructorConcept 
{
	public static void main(String[] args) 
	{
		ConstrutorClass c=new ConstrutorClass(10,20);
		ConstrutorClass c1=new ConstrutorClass();
	}
}
/*
1.Constructor is special member in a class.

2.Constructor have the same name as the classname.

3.Constructor is used to create an object.

4.Constructor can be used to initialize non static data members.

5.Constructor will not return any value(not even void).

6.Constructor will be invoked at the time of object creation

7.Inside Constructor we can initialize variables.

Type of Constructor

a.Default Constructor

1.Default constructors are created by compiler.
2.Default constructors doesn't accept any arguments.
3.Default constructors cannot initialize non static members it provides default values.

b.Zero-Arg Constructor

Zero Arg Constructor is created by programmers.
We can initialize non static members in the body of the constructor.
Zero-Arg Constructor doesn't accept any arguments.
	
c.Parameterized Constructor

Parameterized Constructor is created by Programmer.
In Parameterized Constructor we can initialize non static members with the help of arguments.
In Parameterized Constructor we can pass values in the form of arguments.

Constructor

	1. Constructor is a block of codes similar to the method. 
	2. Constructor is a special type of method which is used to initialize the object(create an object)
	3. Constructor is called when an instance of the class is created.
	4. Every time an object is created using the new() keyword, at least one constructor is called.
	5. If there is no constructor in a class, compiler automatically creates a default constructor.
	
Rules for creating Java constructor

	1. Constructor name must be the same as its class name
	2. Constructor doesn't have return type
	3. Constructor cannot be abstract, static, final, and synchronized

Note

	1. We can use access modifiers while declaring a constructor. 
	2. It controls the object creation. 
	3. We can have private, protected, public or default constructor in Java.

Types of Constructor

	1. Default Constructor 
		a. Default Constructor is created by compiler.
		b. We cannot initialize non static members with the default constructor as it provides default values(0,null)
		c. Default Constructor doesn't accept any arguments.
	2. Zero Argument Constructor
		a. Zero Argument Constructor is created by the programmer.
		b. We can initialize non static members in the body of the constructor
		c. Zero Argument Constructor doesn�t accept any arguments
	3. Parameterized Constructor
		a. Parameterized Constructor is created by the programmer.
		b. We can initialize non static members with the help of arguments.
		c. Parameterized Constructor we can pass the values in the form the arguments.
		Parameterized Constructor is used to provide different values to distinct objects. 


Java Constructor/Java Method

Java Constructor
	1. Constructor is used to initialize the state of an object.	
	2. Constructor doesn't not have a return type.	
	3. Constructor is invoked implicitly(called by compiler)	
	4. Compiler provides a default constructor if we don't have any constructor in a class.	
	5. Constructor name must be same as the class name.	

Java Method
	1. Method is used to expose the behavior of an object.
	2. Method must have a return type.
	3. Method is invoked explicitly(called by object)
	4. Method is not provided by the compiler in any case.
	5. Method name may or may not be same as the class name



*/