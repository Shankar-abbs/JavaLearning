package com.basicprograms.collections;

public class LamdaExample {

	public static void main(String[] args) {
		
		A a = ()->
		{
			System.out.println("This is Hii In LamdaMethod");
			//Lambda Method
		};
		
		
		A aa = new A()
				{
					@Override
					public void hi() {
						System.out.println("This is Hii in aa clss");
					}
					//Object Creation and Implementation for functional interface
				};
				aa.hi();
		a.hi();
		cc c = new cc();
		//Normal Implementation for interface
		c.hi();

	}
}
interface A
{
	void hi();
}
class cc implements A
{
	@Override
	public void hi() {
		System.out.println("This is Hii in cc Cls");
	}	
}
