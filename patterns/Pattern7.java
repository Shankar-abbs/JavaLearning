package com.basicprograms.patterns;

public class Pattern7 {

	public static void main(String[] args) 
	{
		int rows=5,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int s=rows;s>r;s--)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=temp;c++)
			{
				if(c==1||c==temp)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			temp+=2;
		}
		temp-=2;
		for(int r=2;temp>0;r++)
		{
			for(int s=1;s<r;s++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<temp;c++)
			{
				if(c==1||c==temp-2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			temp-=2;
		}
	}
}
