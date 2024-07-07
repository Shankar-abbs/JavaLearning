package com.basicprograms.loops;

public class MpowN {

	public static void main(String[] args) 
	{
		int m=4,n=2,ans=1;
		for(;n>=1;n--)
		{
			ans = ans*m;
		}
		System.out.println(ans);
	}

}
