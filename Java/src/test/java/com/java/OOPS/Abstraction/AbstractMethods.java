package com.java.OOPS.Abstraction;

abstract class Abstract
{
	 abstract void method();
}
public class AbstractMethods extends Abstract
{
	void method()
	{
		System.out.println("Abstract Methods can be implemented via inheritance- Method Overriding");
	}
	public static void main(String[] args) 
	{
		AbstractMethods am=new AbstractMethods();
		
		am.method();
	}
}
/*

Abstraction 
-------------

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstraction focus on what the object does instead of how it does it.

Ways to achieve Abstraction
------------------------------

1. Abstract class (0 to 100%)
	
2. Interface (100%)

Abstract class 
----------------

1. A class which is declared as abstract is known as an abstract class.

2. It can have abstract and non-abstract methods. 

3. It needs to be extended and its method implemented. 

4. It cannot be instantiated.

Points to Remember
---------------------

It can have constructors and static methods also.

It can have final methods which will force the subclass not to change the body of the method.

Abstract Method 
-------------------

A method which is declared as abstract and does not have implementation is known as an abstract method.


Rule
-----

1. If there is an abstract method in a class, that class must be abstract.
	
2. If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
	

*/