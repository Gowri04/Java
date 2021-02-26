package com.java.Basics;
class Inherit               
{
	final void inherit()               
	{
		System.out.println("Method declared as Final");
	}
	Inherit(final int a)
	{
		System.out.println("Inherit");
	}
}
public class FinalKeyword
{
	final int a=10;
	//a=20;
	
	public static void main(String[] args) 
	{
		FinalKeyword f=new FinalKeyword();
		
		System.out.println(f.a);
		
		Inherit i=new Inherit(10);
	}
}