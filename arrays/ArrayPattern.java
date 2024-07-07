package com.basicprograms.arrays;

public class ArrayPattern 
{
	public static void main(String[] args) 
	{
		int[] a = new int[] {-18,18,2,6,9,-10,9,-16};
		int[] b = new int[a.length];
		int j=0;
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nArray after sorting");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int t:b)
		{
			System.out.print(t+" ");
		}
	}
}
