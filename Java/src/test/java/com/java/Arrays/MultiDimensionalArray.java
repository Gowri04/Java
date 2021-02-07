package com.java.Arrays;

public class MultiDimensionalArray
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][2]; //Declaration of multi dimensional array
		//int [][]a=new int[][];	
		//Find the size of an array	
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		//int a[][]={ {10,20}, {30,40}, {50,60}
		System.out.println("Number of Rows "+a.length); //find the length of an array
		System.out.println("Number of columns " +a[0].length); 
		
		/*for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) //read values using for loop
			{
				System.out.println(a[i][j]);
			}
		}
		*/
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}	
}
}

/*Number of Rows 3
Number of columns 2
10
20
30
40
50
60
*/
		

