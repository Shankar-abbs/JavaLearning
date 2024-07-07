package com.basicprograms.classes;

public class NaturalNumClass 
{
	public static void main(String[] args) 
	{
		Natnum n1 = new Natnum();
		int n=10;
		System.out.println(n1.sum(n));
	}
}
class Natnum
{
	int sum(int n)
	{
		if(n<1)
			return n;
		else
			return n+(sum(n-1));
	}
}
