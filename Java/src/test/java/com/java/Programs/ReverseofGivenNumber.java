package com.java.Programs;

import java.util.Scanner;

//Write a program to Print REVERSE of N to 1 numbers?
public class ReverseofGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int number=s.nextInt();
		
		for(int i=1;i>=number;i++)
		{
			System.out.println(i);
		}
	}
}
