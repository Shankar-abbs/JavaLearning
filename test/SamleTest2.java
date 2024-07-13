package com.basicprograms.test;

public class SamleTest2 
{
	static SampleFile s1 = new SampleFile();
	void call()
	{
		s1.dooplicate();
		System.out.println(s1.x);
	}
	public static void main(String[] args)
	{
		System.out.println(s1.x);
		s1.dooplicate();
	}
}



