package com.java.Basics;
class inherit               
{
	final void inherit()               
	{
		System.out.println("Method declared as Final");
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
	}
}
/*

Final Keyword is used to create varaibles with a constant values.

We cannot Re-intilize the final varaible. 


Final keyword is used for creating constant values.
Final Keyword can be used for varaibles, methods and classes.

If the varaible is created as final we cannot change the value.
if we create the class as final we cannot extend.
If we create a method with final we cannot ovveride. 

If we try to change the value or extend the class or override the method it will throw an Compile Time Error.

 */