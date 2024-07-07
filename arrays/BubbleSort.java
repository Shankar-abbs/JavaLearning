package com.basicprograms.arrays;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a = new int[] {2,4,11,5,68,2,79,0,2};
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("\nAfter doing bubble sort");
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}

