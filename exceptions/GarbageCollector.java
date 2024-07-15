package com.basicprograms.exceptions;
public class GarbageCollector
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		GarbageCollector gcc = new GarbageCollector();
		gcc = null;
		System.gc();
		System.out.println("Hello in main");
	}

	@Override
	protected void finalize() throws Throwable {
			System.out.println("Finalize in Gb");
	}
}
