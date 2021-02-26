package com.java.OOPS.Polymorphism;
class MethodOverloading
{
	void method(int a, int b)
	{
		System.out.println("Compile Time Polymorhism");
	}
	int method(int a, int b,int c)
	{
		System.out.println("MethodOverloading");
		return a; 
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
		
		int x=mo.method(20,30,40);
		
		System.out.println(x);
	}
}