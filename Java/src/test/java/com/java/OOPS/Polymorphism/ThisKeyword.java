package com.java.OOPS.Polymorphism;
class ClassKeyword
{
	int a=10;
	int b=20;
	int c=30;
	
	ClassKeyword(int a,int b)
	{
		a=this.a;
		System.out.println(a+b);
	}
	
	ClassKeyword(int a, int b,int c)
	{
		System.out.println(a+b+c);
		this.b=b; 
		System.out.println(a+b+c);
	}
}
public class ThisKeyword 
{
	public static void main(String[] args) 
	{
		ClassKeyword c=new ClassKeyword(20,30);
		ClassKeyword c1=new ClassKeyword(20,30,50);	
	}
}