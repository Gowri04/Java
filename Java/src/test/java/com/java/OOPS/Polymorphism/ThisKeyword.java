package com.java.OOPS.Polymorphism;
class ClassKeyword
{
	int a=10;
	int b=20;
	int c=30;
	
	ClassKeyword(int a,int b)
	{
		a=this.a;
		System.out.println(a+b);
	}
	
	ClassKeyword(int a, int b,int c)
	{
		System.out.println(a+b+c);
		this.b=b; 
		System.out.println(a+b+c);
	}
}
public class ThisKeyword 
{
	public static void main(String[] args) 
	{
		ClassKeyword c=new ClassKeyword(20,30);
		ClassKeyword c1=new ClassKeyword(20,30,50);	
	}
}
/*

this keyword is used to refer a class varaible.
We use this keyword if there is any diffidence between class varaibles and method parameters.

This keyword 

This  keyword is a reference variable that refers to the current object.

Usage of java this keyword

	1. this can be used to refer current class instance variable.
	The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
	Understanding the problem without this keyword

Note:
If local variables(formal arguments) and instance variables are different, there is no need to use this keyword�
	2. this can be used to invoke current class method (implicitly)
	You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
	3. this() can be used to invoke current class constructor.
	The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
	4. this can be passed as an argument in the method call.
	5. this can be passed as argument in the constructor call.
	6. this can be used to return the current class instance from the method.







*/