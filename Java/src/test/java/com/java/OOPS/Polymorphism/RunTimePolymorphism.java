package com.java.OOPS.Polymorphism;

class RuntimeA
{
	void method()
	{
		System.out.println("RuntimeA method");
	}
}
class RuntimeB extends RuntimeA
{
	@Override
	void method()
	{
		System.out.println("RuntimeB method");
	}
}
public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		RuntimeB mo=new RuntimeB();
		
		mo.method();
	}
}
/*


Method Overriding 
-------------------

If subclass (child class) has the same method as declared in the parent class.

Usage of Java Method Overriding
--------------------------------

1. Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.

2. Method overriding is used for runtime polymorphism.

Rules for Java Method Overriding
------------------------------------

1. The method must have the same name as in the parent class

2. The method must have the same parameter as in the parent class.

3. There must be an IS-A relationship (inheritance).

Can we override static method?
--------------------------------

No, a static method cannot be overridden.

Why can we not override static method?
-----------------------------------------

1. It is because the static method is bound with class whereas instance method is bound with an object. 

2. Static belongs to the class area, and an instance belongs to the heap area.

Can we override java main method?
-----------------------------------

No, because the main is a static method.

Method Overloading/Method Overriding 
---------------------------------------

Method Overloading
---------------------

1. Method overloading is used to increase the readability of the program.	

2. Method overloading is performed within class.	

3. In case of method overloading, parameter must be different.	

4. Method overloading is the example of compile time polymorphism.	

5. Method overloading can't be performed by changing return type of the method only. 

Return type can be same or different in method overloading. But you must have to change the parameter.	


Method Overriding 
--------------------

1. Method overriding is used to provide the specific implementation of the method that is already provided by its super class.

2. Method overriding occurs in two classes that have IS-A (inheritance) relationship.

3. In case of method overriding, parameter must be same.

4. Method overriding is the example of run time polymorphism.

5. Return type must be same or covariant in method overriding.



*/