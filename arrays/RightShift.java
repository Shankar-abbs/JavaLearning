package com.basicprograms.arrays;
public class RightShift 
{
	public static void main(String[] args) 
	{
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		int temp = a[a.length-1],i;
		for(i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=temp;
		System.out.println("\nAfter Shifting Right");
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}
