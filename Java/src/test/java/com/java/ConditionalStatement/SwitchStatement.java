package com.java.ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		int accountnumber=10001;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		
		int accnumber=s.nextInt();
		
		if(accountnumber==accnumber)
		{
			System.out.println("Withdraw - Press 1");
			System.out.println("Deposit - Press 2");
			System.out.println("Balance - Press 3");

			System.out.println("Press Number");
			
			int v=s.nextInt();
			
			switch(v)
			{
			case 1: System.out.println("Enter Withdraw Amount");
			break;
			
			case 2: System.out.println("Enter Deposit Amount");
			break;
			
			case 3:System.out.println("Available Balance");
			break;
			
			default: System.out.println("Invalid Operation");
			break;
			
			}
		}
	}
}
