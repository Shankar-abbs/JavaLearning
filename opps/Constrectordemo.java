package com.basicprograms.opps;
public class Constrectordemo 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.India();
		obj.england();
	}
}
class Demo
{
	int dollar=18;
	void India()
	{
		System.out.println("in India "+(dollar*80)+" Rupees");
	}
	void england()
	{
		System.out.println("in England "+(dollar*0.7)+" Pounds");
	}
}
