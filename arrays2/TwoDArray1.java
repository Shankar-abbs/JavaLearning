package com.basicprograms.arrays2;

public class TwoDArray1 
{
	public static void main(String[] args)
	{
		int a[][] = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int r=3,c=3;
		
		for(int i=0;i<r;i++)
		{	
			int high=a[0][0];
			
			for(int j=0;j<c;j++)
			{
				high=a[0][0];
				
				if(a[i][j]>high)
				{
					high=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(high);
			System.out.println();
		}
	}
}
