package com.java.Programs;

import java.util.Scanner;
//Write a program to Print 1 to N numbers?
public class PrintNNumbers 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int number=s.nextInt();
		
		/*for(int i=number;i>=1;i--)
		{
			System.out.print(i+ " ");
		}
		*/
		
		int i=number;
		while(i>=1)
		{
			System.out.print(i+ " ");
			i--;
		}	
	}
}
