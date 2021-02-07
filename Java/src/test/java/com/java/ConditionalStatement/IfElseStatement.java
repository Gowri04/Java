package com.java.ConditionalStatement;

import java.util.Scanner;

public class IfElseStatement 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Amount: ");
		
		int firstamount=s.nextInt();
		
		System.out.println("Enter Second Amount: ");
		
		int secondamount=s.nextInt();
		
		if(firstamount>secondamount)
		{
			System.out.println("First Amount is Greater");
		}
		else
		{
			System.out.println("Second Amount is Greater");
		}
	}
}
