package com.java.ConditionalStatement;

import java.util.Scanner;

public class IfStatement 
{
	public static void main(String[] args) 
	{
		int accountnumber=10000001;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		
		int accountno=s.nextInt();
		
		if(accountnumber==accountno)
		{
			System.out.println("Account Number Matched");
		}
		else
		{
			System.out.println("Account Number Not Matched");
		}
	}
}
/*

If Statement is a branching statement.

Using If statement we can build decision making blocks.

Else can only be written after the if statement.

A single if can have multiple elseIf Blocks, but only one else block.


*/