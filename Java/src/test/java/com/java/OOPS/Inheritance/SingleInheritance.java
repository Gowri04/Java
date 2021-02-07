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

*/