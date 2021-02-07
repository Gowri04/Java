package com.java.ConditionalStatement;
import java.util.Scanner;
public class NestedIFElseStatement 
{
	public static void main(String[] args) 
	{	
		String branchname="Chennai Branch";
		
		int accountnumber=10000001;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter BranchName: ");
		
		String branch=s.nextLine();
		
		System.out.println("Enter Account Number: ");
		
		int accountno=s.nextInt();
		
		if(branch.equals(branchname) & accountnumber==accountno)
		{
			System.out.println("Branch Name and Account Number Matched");
		}
		else
		{
				System.out.println("Branch Name and Account Number Not Matched");
		}
	}
}
