package com.basicprograms.arrayQuestions;

public class SwapAdjacent 
{
	public static void main(String[] args)
	{
		int n[] = {12 , 56, 34, 23 , 76 , 32, 75 , 90 , 345};
		
		//Swap the adjacent elements in the array
		
		System.out.println("Before swapping");
		for(int t:n)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nAfter Swapping");
		for(int i=0;i<n.length-1;i+=2)
		{
			int temp=n[i];
			n[i]=n[i+1];
			n[i+1]=temp;
		}
		for(int t:n)
		{
			System.out.print(t+" ");
		}
	}
}
