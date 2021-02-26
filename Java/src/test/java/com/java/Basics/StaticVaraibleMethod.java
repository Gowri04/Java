package com.java.Basics;
public class StaticVaraibleMethod
{
	static int a=10;
	
	static void method()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) 
	{
		System.out.println(StaticVaraibleMethod.a);		
				
		StaticVaraibleMethod.method();		
	}
}