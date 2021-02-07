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

*/