package com.basicprograms.exceptions;

public class SimpleThrowsExample 
{
	static int balance = 1800000;
	public static void main(String[] args)
	{
		withdraw(1900000);
	}
	static void withdraw(int a)
	{
		if(a>balance)
		{
			try
			{
				throw new InsufficentBalance("Insufficeint Balance");
			}
			catch(InsufficentBalance i)
			{
				System.out.println("InsufficentBalance Exception occured and catched");
			}
		}
	}
}

class InsufficentBalance extends RuntimeException
{
	InsufficentBalance(String msg)
	{
		super(msg);
	}
}


