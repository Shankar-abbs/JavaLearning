package com.basicprograms.arrays;

public class DelElement 
{
	public static void main(String[] args)
	{
		int[] a = new int[] {10,20,30,40,50};
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		int pop=50;
		System.out.println("\nArray After popping "+pop);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==pop)
			{
				a[i]=0;
			}
			if(a[i]==0 && i<a.length-1)
			{
				int t = a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}
