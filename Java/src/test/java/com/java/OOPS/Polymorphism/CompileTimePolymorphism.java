package com.java.OOPS.Polymorphism;
class MethodOverloading
{
	void method(int a, int b)
	{
		System.out.println("Compile Time Polymorhism");
	}
	void method(int a, int b, int c)
	{
		System.out.println("MethodOverloading");
	}
	void method(String s, String s1)
	{
		System.out.println("Binding are happened at Compile Time");
	}
}
public class CompileTimePolymorphism 
{
	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		
		mo.method(10,20);
		
		mo.method("Java", "Programming");
		
		mo.method(20,30,40);
	}
}
/*

Polymorphism
----------------
1. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

2. Polymorphism in Java is a concept by which we can perform a single action in different ways.

There are two types of polymorphism in Java: 

1. Compile-time polymorphism - methodoverloading

2. Runtime polymorphism - methodoverriding

Method Overloading
-----------------------
1. A class having multiple methods with same name but different parameters is called Method Overloading.
2. There are three ways to overload a method
	a. Parameters with different data types
	b. Parameters with different sequence of a data types
	c. Different number of parameter
3. Method overloading increases the readability of the program.

Why we need Method Overloading?
-------------------------------
We need method overloading to perform multiple operations.
		
Why Method Overloading is not possible by changing the return type of method only?
-------------------------------------------------------------------------------------
Method overloading is not possible by changing the return type of the method only because of ambiguity. 

Note
----
1. Compile Time Error is better than Run Time Error. 
2. So, java compiler renders compiler time error if you declare the same method having same parameters.
	
Can we overload java main() method?
-------------------------------------
1. Yes, by method overloading. You can have any number of main methods in a class by method overloading.
2. But JVM calls main() method which receives string array as arguments only.





*/