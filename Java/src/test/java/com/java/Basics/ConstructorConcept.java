package com.java.Basics;

class ConstrutorClass
{
	ConstrutorClass()
	{
		System.out.println("Non Parameterized Constructor");
	}
	ConstrutorClass(int a, int b)
	{
		System.out.println("Parameterized Constructor");
	}
}
public class ConstructorConcept 
{
	public static void main(String[] args) 
	{
		ConstrutorClass c=new ConstrutorClass(10,20);
		ConstrutorClass c1=new ConstrutorClass();
	}
}