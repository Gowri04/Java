package com.java.Basics;
class ConstructorOverloadingClass
{
	ConstructorOverloadingClass(int a, int b)
	{
		System.out.println("Integer Datatype");
	}
	ConstructorOverloadingClass(float f, double d)
	{
		System.out.println("Float and Double Datatype");
	}
	ConstructorOverloadingClass(char c, String s)
	{
		System.out.println("Character and String Datatype");
	}
}
public class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		ConstructorOverloadingClass co=new ConstructorOverloadingClass(10,20);
		ConstructorOverloadingClass c1=new ConstructorOverloadingClass(10.5f,20.65d);
		ConstructorOverloadingClass c2=new ConstructorOverloadingClass('G',"Java");
	}
}
/*

Overloading: Creating multiple constructors with the same name but with different parameters.

1.Constructor Overloading is a concept of creating multiple constructors in a class.

2.In Constructor Overloading it is mandatory to change the argument list.

*/