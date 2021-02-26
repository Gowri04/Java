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
*/

