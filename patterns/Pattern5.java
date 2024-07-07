package com.basicprograms.patterns;

public class Pattern5 
{

	public static void main(String[] args) 
	{
		int rows=18;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++,ch++)
			{
				if(c==1||r==rows||r==c)
				{
					System.out.print(ch+" ");
				}
				else {
					System.out.print("  ");
				}
				ch = (ch==90)?ch+=6:(ch==122)?64:ch;
			}
			System.out.println();
		}
	}
}
