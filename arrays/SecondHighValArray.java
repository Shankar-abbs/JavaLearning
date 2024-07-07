package com.basicprograms.arrays;

public class SecondHighValArray 
{
	public static void main(String args[])
	{
		int a[] = new int[] {3,5,1,4,7,5,9,3,24,33,55,73,25,7,9,24,23};
		
		int high=(a[0]>a[1])?a[0]:a[1],shigh=(a[0]<a[1])?a[0]:a[1];
		
		for(int i=1;i<a.length-1;i++)
		{
			if(high>a[i+1]&&shigh<a[i+1])
			{
				shigh = a[i+1];
			}
			else if(high<a[i+1])
			{
				shigh = high;
				high = a[i+1];
			}		
		}
		System.out.println("Array");
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		System.out.println("\nSecond Highest is "+shigh);
		System.out.println("Highest is "+high);
	}
}
