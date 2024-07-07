package com.basicprograms.loops;

public class Tribonocci {

	public static void main(String[] args) 
	{
		int a=0,b=1,c=1,start=1;
		System.out.println(a);
		System.out.println(b);
		for(;start<=10;start++)
		{
			int temp=c,temp1=b;
			System.out.println(c);
			c = c+b+a;
			b = temp;
			a = temp1;
		}
	}
}
