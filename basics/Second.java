package com.basicprograms.basics;

public class Second 
{
	public static void main(String[] args)
	{
		int a[]= new int[] {1,2,3,4,5,0,0,0,0,0,0,6};
		int b[] = new int[a.length];
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		
		for(int i=0,j=a.length-1,k=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[j]=a[i];
				j--;
			}
			else {
				b[k]=a[i];
				k++;
			}
		}
		System.out.println("After sorted");
		for(int temp:b)
		{
			System.out.print(temp+" ");
		}
	}
}
