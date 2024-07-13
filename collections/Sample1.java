package com.basicprograms.collections;
import java.util.Stack;

public class Sample1 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Stack<Comparable> l = new Stack<>();
		l.add("Shankar");
		l.add("vinay");
		l.add(18);
		l.add(1.8);
		l.pop();
		l.pop();
		l.push(18);
		l.push(1.8);
		System.out.println(l);
	}
}