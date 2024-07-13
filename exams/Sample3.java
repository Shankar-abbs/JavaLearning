package com.basicprograms.exams;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
//		a.add(12, 13);
//		a.add(12, 13,14);
		System.out.println(a);
	}

}
class Add 
{
	String name = "Shankar";
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	@Override
	public String toString() {
		
		return name;
	}
	
}

