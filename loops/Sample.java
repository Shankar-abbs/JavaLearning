package com.basicprograms.loops;

public class Sample {

	public static void main(String[] args)
	{
		int n=18892,evensum=0,oddsum=0;
		System.out.println("Given num is "+n);
		for(;n>0;n=n/10)
		{
			int rem = n%10;
			if(rem%2==0)
			{
				System.out.print("even digit: "+rem+" and "+rem+"+2"+" is");
				evensum = rem+2;
				System.out.println(evensum);
				
			}
			else
			{
				System.out.print("odd digit: "+rem+" and "+rem+"+1"+" is");
				oddsum = rem+1;
				System.out.println(oddsum);
				
				
			}
		}

	}

}
