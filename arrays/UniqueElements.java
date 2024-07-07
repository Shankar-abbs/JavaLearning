package com.basicprograms.arrays;

public class UniqueElements 
{
	public static void main(String[] args) 
	{
		int a[] = {2,32,6,24,54,65,18,19,19,24,7,7};
		boolean [] b = new boolean[a.length];
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nAfter Sort");
		
		for(int x=0;x<a.length;x++)
		{
			int count=1;
			if(b[x])
			{
				continue;
			}
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count<=2)
			{
				System.out.println(a[x]);
			}			
		}
	}
}

