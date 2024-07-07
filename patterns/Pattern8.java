package com.basicprograms.patterns;

public class Pattern8 
{

	public static void main(String[] args) 
	{
		int rows=5,temp=1;

		for(int r=1;r<=rows;r++)
		{
			for(int c=rows;c>r;c--)
			{
				System.out.print("* ");
			}
			for(int sp=temp;sp>1;sp--)
			{
				System.out.print("  ");
			}
			temp+=2;
			for(int s=rows;s>r;s--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		temp-=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print("* ");
			}
			for(int sp=temp;sp>1;sp--)
			{
				System.out.print("  ");
			}
			for(int s=1;s<=r;s++)
			{
				System.out.print("* ");
			}
			temp-=2;
			System.out.println();
		}
	}

}
