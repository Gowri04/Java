package com.java.Basics;

public class JavaOperators 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		
		System.out.println("Arithmetic Operators");
		
		System.out.println("Addition of Two Numbers: "+ (a+b));
		System.out.println("Substraction of Two Numbers: "+ (a-b));
		System.out.println("Multiplication of Two Numbers: "+ a*b);
		System.out.println("Division of Two Numbers: "+ a/b);
		System.out.println("Modulos of Two Numbers: "+ a%b);
		
		System.out.println("Relational Operators");
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		
		System.out.println("Logical Operator");
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a!=b);
		
		/*System.out.println("Assignment Operators");
		
		System.out.println(a=b);
		System.out.println(b=a);
		
		*/
		//increment and print
		System.out.println("Pre Increment and Decrement Operator"); 
		System.out.println(++a); 
		System.out.println(--a); 
		
		//print and increment
		System.out.println("Post Increment and Decrement Operator"); 
		System.out.println(a++); 
		System.out.println(a--); 
	}
}
/*

Operators is a symbol(+,-,*) which is used to perform certain task.

Logical Operators: Works between two boolean.
&&-Display if both the condition is TRUE.
||-Display if either one of the condition is TRUE.
!-Display the condition is not TRUE.


Increment Operator(++)

Decrement Operator(--)

In Post Operation current value is used and increment or decrement is performed(a++),(a--).

In Pre Operation current value is first incremented or decremented.(++a),(--a).

*/