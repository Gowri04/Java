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
1. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
2. Polymorphism in Java is a concept by which we can perform a single action in different ways.

There are two types of polymorphism in Java: 
1. Compile-time polymorphism - methodoverloading
2. Runtime polymorphism - methodoverriding
Method Overloading

1. A class having multiple methods with same name but different parameters is called Method Overloading.
2. There are three ways to overload a method
a. Parameters with different data types
b. Parameters with different sequence of a data types
c. Different number of parameter
3. Method overloading�increases the readability of the program.
	
		
Why Method Overloading is not possible by changing the return type of method only?

Method overloading is not possible by changing the return type of the method only because of ambiguity. 

Note
1. Compile Time Error is better than Run Time Error. 
2. So, java compiler renders compiler time error if you declare the same method having same parameters.
	
Can we overload java main() method?
1. Yes, by method overloading. You can have any number of main methods in a class by method overloading.
2. But JVM calls main() method which receives string array as arguments only.

Method Overriding 

If a child class provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding

1. Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
2. Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).


Can we override static method?
No, a static method cannot be overridden

Why can we not override static method?
1. It is because the static method is bound with class whereas instance method is bound with an object. 
2. Static belongs to the class area, and an instance belongs to the heap area.

Can we override java main method?
No, because the main is a static method.

Method Overloading/Method Overriding 

Method Overloading

1. Method overloading is used to increase the readability of the program.	
2. Method overloading is performed within class.	
3. In case of method overloading, parameter must be different.	
4. Method overloading is the example of compile time polymorphism.	
5. In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.	


Method Overriding 

1. Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
2. Method overriding occurs in two classes that have IS-A (inheritance) relationship.
3. In case of method overriding, parameter must be same.
4. Method overriding is the example of run time polymorphism.
5. Return type must be same or covariant in method overriding.


*/