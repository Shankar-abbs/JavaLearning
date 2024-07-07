package com.basicprograms.arrays;

public class ArrayP1 {

	public static void main(String[] args) {
		
		int a[] = new int[] {11,22,33,44,55,66,77,88};
		Doop obj = new Doop();
		System.out.println("Before Sorting");
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		System.out.println("\nAfter Sorting");
		for(int temp:obj.Arr(a)) {
			System.out.print(temp+" ");
		}	
	}
}
class Doop{
	
	int[] Arr(int n[])
	{	
		int temp = n[0];
		n[0] = n[1];
		n[1] = temp;
		for(int i=1;i<n.length;i++)
		{
			if(i%2==0)
			{
				int tempa=n[i];
				n[i]=n[i+1];
				n[i+1]=tempa;
			}
		}
		return n;
	}
}
