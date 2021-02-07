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
