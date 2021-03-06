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

Constructor Overloading

Creating multiple constructors in a class with same name but different arguments.
		
Different Types of Arguments

1. Types of Arguments(Datatypes)

2. Length of Arguments(No of Arguments)

3. Sequence of Arguments(Order of Arguments)




*/