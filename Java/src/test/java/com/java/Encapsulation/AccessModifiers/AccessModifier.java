package com.java.Encapsulation.AccessModifiers;

class AccessModifiersClass
{
	public void method()
	{
		System.out.println("Public Access Modifier- Anywhere inside the project");
	}
	
	protected void method2()
	{
		System.out.println("Protected Access Modifier- Only particular package we can access via inheritance");
	}
}
public class AccessModifier 
{
	private void method1()
	{
		System.out.println("Private Access Modifier- Within particular class");
	}
	public static void main(String[] args)
	{
		AccessModifiersClass amc=new AccessModifiersClass();
		
		amc.method();
		
		amc.method2();	
		
		AccessModifier am=new AccessModifier();
		
		am.method1();
	}
}
/*


Encapsulation�is a�process of wrapping code and data together into a single unit.
Package

	1. A�java package�is a group of classes, interfaces and sub-packages.
	2. Package in java can be categorized in two form, 
		a. Built-in package(java, lang, awt, net, io, util, sql)
		b. User-defined package
	3. package keyword�is used to create a package in java.
		
	
Advantage of Java Package

1) Used to categorize the classes and interfaces that can be easily maintained.
2) Provides access protection.
3) Removes naming collision.

How to access package from another package?
There are three ways to access the package from outside the package.
	1. import package.*; - User can access all the class/interface in the package
	2. import package.classname; - User can access only the specific class name from the package
	3. fully qualified name.

Access Modifiers

	1. Access modifiers specifies the accessibility or scope of a field, method, constructor, or class. 
	2. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

Two types of modifiers in Java
Access modifiers
 
	1. Private
		a. The access level of a private modifier is only within the class. 
		b. It cannot be accessed from outside the class.
	2. Default
		a. The access level of a default modifier is only within the package. 
		b. It cannot be accessed from outside the package.
		c. If you do not specify any access level, it will be the default.
	3. Protected
		a. The access level of a protected modifier is within the package and outside the package through child class.
		b. If you do not make the child class, it cannot be accessed from outside the package.
	4. Public 
		a. The access level of a public modifier is everywhere. 
		b. It can be accessed from within the class, outside the class, within the package and outside the package.

Access Modifier	within class	within package	outside package by subclass only	outside package
Private	Y	N	N	N
Default	Y	Y	N	N
Protected	Y	Y	Y	N
Public	Y	Y	Y	Y

Non-access modifiers
	1. static, 
	2. abstract, 
	3. synchronized, 
	4. native, 
	5. volatile, 
	6. transient, etc. 



*/