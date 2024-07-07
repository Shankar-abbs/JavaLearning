package com.basicprograms.arrays;

public class ArrayTest1 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {2,3,5,8,1};
		
		One obj = new One();
		
		for(int temp:obj.Sort(a))
		{
			System.out.print(temp+" ");
		}
	}
}
class One{
	int[] Sort(int a[]){
		
		int b[] = new int[a.length];
		b[0]=a[0]+a[1];
		b[b.length-1]=a[a.length-1]+a[a.length-2];
		
		for(int i=1;i<b.length-1;i++) {
			b[i]=a[i-1]+a[i+1];
		}
		return b;
	}
}