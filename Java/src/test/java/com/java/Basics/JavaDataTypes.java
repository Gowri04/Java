package com.java.Basics;
public class JavaDataTypes 
{
	int a;	//declaration
	float f;
	double d;
	char c;
	String s;
	
	void datatypes()
	{
		a=10; //definition
		f=20.05f;
		d=20.006d;
		c='G';
		s="Java";
		
		System.out.println("Integer Datatypes: "+ a);
		
		System.out.println("Float Datatypes: "+ f);
		
		System.out.println("Double Datatypes: "+ d);
		
		System.out.println("Character Datatypes: "+ c);
		
		System.out.println("String Datatypes: "+ s);
	}
	
	public static void main(String[] args) 
	{
		JavaDataTypes datatypes=new JavaDataTypes();
	
		datatypes.datatypes();		
	}
}
/*

Datatypes is used to store the type of value inside a varaible.

Types of Datatypes

Primitive Datatypes:byte,short,int,long,float,double,char,boolean.
Derived Datatypes:Array,ArrayList,String,Hashmap.


*/