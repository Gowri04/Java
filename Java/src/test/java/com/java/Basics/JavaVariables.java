package com.java.Basics;
public class JavaVariables 
{
	int a=10; //instance variable
	
	static int b=20; //static  variable
	
	void method()
	{
		int c=30; //local variable
	}
	public static void main(String[] args) 
	{	
		JavaVariables variable=new JavaVariables();
		
		System.out.println(variable.a);
		
		System.out.println(JavaVariables.b);
	}
}