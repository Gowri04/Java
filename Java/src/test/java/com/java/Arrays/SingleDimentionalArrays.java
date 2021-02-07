package com.java.Arrays;

public class SingleDimentionalArrays 
{
	public static void main(String[] args) 
	{
		/*int a[]=new int[5]; //Declaration of an array with size
		a[0]=10; //storing values in an array
		a[1]=10;
		a[2]=10;
		a[3]=10;
		a[4]=10;
		*/
		int a[]= {10,20,30,40,50}; //Declare an array without the size
		System.out.println("Length of an Array: " +a.length); //prints the length or size of an array
		System.out.println(a[2]); // read the specific value in an array
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);     //read values using for loop
		}
		*/
		
		for(int i:a)
		{
			System.out.println(i);   //read values using    Enhanced for loop
		}	
	}
}

/*
Length of an Array: 5
30
10
20
30
40
50 

Array is a collection of values of the same datatype.

Syntax

Datatype arrayname=new datatype[size]

Two Types of Array

Single Dimensional Array
Two/Multi Dimentional Array
 
int a[]=new int[5]   
int  []a=new int[5]	 
	    
Insert values into an array
Find the size of the array
Read values from an array 
 
*/

