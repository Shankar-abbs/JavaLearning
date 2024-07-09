package com.basicprograms.arrayQuestions;

public class BasicPrinting 
{
	public static void main(String[] args)
	{
		int n[] = {139, 12, 34, 5, 566,7};
		
		//Find the length of all the above array without using method length
		//Using for- each loop Display the above array
		
		int count=0;
		for(int t:n)
		{
			System.out.print(t+" ");
			count++;
		}
		System.out.println("\nThe length of the above array is "+count);
		
		int n2[] = {12 , 56, 34, 23 , 76, 32, 75 , 90, 345};
		
		//Print the above array in reverse order
		System.out.println("Array in reverse order");
		for(int i=n2.length-1;i>=0;i--)
		{
			System.out.print(n2[i]+" ");
		}
		//Print only even indexed elements
		System.out.println("\nEven indexed Elements");
		for(int i=0;i<n2.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(n2[i]+" ");
			}
		}
		
		//Print only odd indexed elements
		
		System.out.println("\nOdd indexed Elements");
		for(int i=0;i<n2.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(n2[i]+" ");
			}
		}
		
	}
}
