package com.basicprograms.opps;

import com.basicprograms.test.SampleFile;

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		SampleFile s = new SampleFile();
		s.dooplicate();
		System.out.println(s.x);
	}
}
class Child extends SampleFile
{
	void call()
	{
		dooplicate();
		System.out.println(x);
	}
}
