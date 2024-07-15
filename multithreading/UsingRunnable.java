package com.basicprograms.multithreading;

public class UsingRunnable {

	public static void main(String[] args) {
		
		Runnable r1 = ()->{
			
			for(int x=1;x<=10;x++) {
				System.out.println(x+" Thread1");
			}
		};
		Runnable r2 = ()->{
			
			for(int x=1;x<=10;x++) {
				System.out.println(x+" Thread2");
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();t2.start();
	}
}

