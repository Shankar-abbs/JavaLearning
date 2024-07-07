package com.basicprograms.arrays;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int [] a = new int[] {12,45,2,6,22,9,01,11,34,78,1,2,3,4,5,6,};
		Arrays.sort(a);
		System.out.println("Sorted array");
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		int first = a[0],last= a.length,search=6,mid ;
		while(first<=last)
		{
			mid = (first+last)/2;
			if(a[mid]<search)
				first = mid+1;
			else if(a[mid]==search)
			{
				System.out.println("\n"+search+" found at "+(mid+1));
				break;
			}
			else
				last = mid-1;
		}
		System.out.println(first>last?"Element Not found":"");	
	}
}
