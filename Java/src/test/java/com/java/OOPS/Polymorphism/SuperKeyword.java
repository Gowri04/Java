package com.java.OOPS.Polymorphism;

class Example
{
	String s="SuperKeyWord";                            
	void display()
	{
		int i=60;
		System.out.println("Example class Method display");
        System.out.println(i);
	}	
	Example()                               
	{
		System.out.println("Example class Constructor");
	}
}
class SuperExample extends Example
{
	void run()
	{
		System.out.println("SupeExample class Method run");
		System.out.println(super.s);       
	}
	void display()
	{
		int i=50;
		System.out.println("SuperExample class Method display");
        System.out.println(i);
        super.display();                   
	}
	SuperExample()
	{
		super();                         
		System.out.println("SuperExample class Constructor");
	}
}
public class SuperKeyword 
{
   public static void main(String[] args) 
   {
     SuperExample se=new SuperExample();
     se.run();
     se.display();  
   }
}

/*

Super keyword is a reference varaible which is used to refer the parent class varaibles,methods and constructors.
super is used to invoke the varaible from the parent class.
super is used to invoke the method from the parent class.
super is used to invoke the constructor.


Super Keyword 
	1. Super keyword  is a reference variable which is used to refer immediate parent class object.
	2. Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
	1. super can be used to refer immediate parent class instance variable.
		a. We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields
	2. super can be used to invoke immediate parent class method.
		a. The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
	3. super() can be used to invoke immediate parent class constructor.

Note
super() is added in each class constructor automatically by compiler if there is no super() or this().



 */

