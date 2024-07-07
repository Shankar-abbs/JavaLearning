package com.basicprograms.arrays;

public class SelectionSort {

	public static void main(String[] args) 
	{
			int [] a = new int [] {4,2,7,3,9,12,4,18,19,19,3};
			
			System.out.println("Before Sorting");
			for(int temp:a)
			{
				System.out.print(temp+" ");
			}
			System.out.println("\nafter sorting");
			Arr obj = new Arr();
			for(int temp: obj.SeleSort(a))
			{
				System.out.print(temp+" ");
			}
	}
}
class Arr
{
	int [] SeleSort(int n[])
	{	
		int min;
		for(int i=0;i<n.length;i++)
		{
			min = i;
			for(int y=i+1;y<n.length;y++)
			{
				if(n[min]>n[y])
				{
					min = y;
				}
			}
			if(min!=i)
			{
				int temp = n[i];
				n[i] =  n[min];
				n[min] = temp;
			}
			
		}
		return n;
	}	
}
