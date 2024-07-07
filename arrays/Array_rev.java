package com.basicprograms.arrays;
public class Array_rev 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {18,16,2,45,7,19,14,17,9,10};
		int b[] = new int[a.length];
		for(int i=0,y=a.length-1;i<=a.length-1;i++,y--)
		{
			b[y]=a[i];
		}
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
	}
}
