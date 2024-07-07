package com.basicprograms.test;

public class SampleFile
{
	public static void main(String[] args)
	{
		SampleFile2 c = new SampleFile2();
		c.kall();
	}
	public int x = 18;
	public void dooplicate()
	{
		System.out.println("Private method");
	}
}
class SampleFile2 extends SampleFile
{
	
	void Cal() 
	{
		dooplicate();
		System.out.println(x);
	}
	protected void kall()
	{
		System.out.println("private void in SampleFile2");
	}
}

