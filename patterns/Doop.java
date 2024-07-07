package com.basicprograms.patterns;

public class Doop 
{
	public static void main(String[] args) 
	{
		int rows=4,cols=5,a=0,b=9;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0) {
					a = (a>9)?0:a;
					System.out.print(a++ +" ");
				}
				else {
					b = (b<0)?9:b;
					System.out.print(b-- +" ");
				}
			}
    		System.out.println();
		}
	}
}
