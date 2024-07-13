package com.basicprograms.multithreading;

public class IndependentThreads {
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setName("Shankar");
		A a2 = new A();
		a2.setName("Ananth");
		a1.start();a2.start();
	}
}
class A extends Thread{

	@Override
	public void run() {
		for(int x=1;x<=10;x++) {
			System.out.println("x = "+x+" "+Thread.currentThread().getName());
		}
	}
	
}
