package com.basicprograms.arrays;
public class LeftShift 
{
	public static void main(String[] args) 
	{
		int[] a = new int[] {50,40,30,20,10};
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nAfter Doing Left Shift");
		int temp=a[0],i;
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[i]=temp;
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}
