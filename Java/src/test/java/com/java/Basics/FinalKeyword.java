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



Final keyword is used to restrict the user.  vera points irrukka final j
The java final keyword can be used in many context. 
Final can be:
variable(final variable value cannot be changed)
method(final methods cannot be overriden)
class(final class cannot be inherted)
final variable that have no value it is called blank final variable or uninitialized final variable. 
It can be initialized in the constructor only. 
The blank final variable can be static also which will be initialized in the static block only.

Is final method inherited?
Yes, final method is inherited but you cannot override it.

What is blank or uninitialized final variable?
A final variable that is not initialized at the time of declaration is known as blank final variable.

If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.

It can be initialized only in constructor.

Can we initialize blank final variable?
Yes, but only in constructor.

static blank final variable
A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block

What is final parameter?
If you declare any parameter as final, you cannot change the value of it.

Can we declare a constructor final?
No, because constructor is never inherited.


 */