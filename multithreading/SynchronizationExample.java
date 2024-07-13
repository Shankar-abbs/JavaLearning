/*Synchronization is Thread Safe
 * It prevents Race Condition
 * Race Condition Occurs when multiple threads work on same task
 * due to race condition Data Inconsistency Occurs
 * To prevent this, Synchronization is used Thats why It is Thread Safe
 * */
package com.basicprograms.multithreading;

public class SynchronizationExample{

	public static void main(String[] args) {
		Aa a1 = new Aa();
		Thread t1 = new Thread(a1,"Shankar");
		Thread t2 = new Thread(a1,"Ananth");
		Thread t3 = new Thread(a1,"Vamsi");
		Thread t4 = new Thread(a1,"Chandu");
		Thread t5 = new Thread(a1,"Yeswant");
		t1.start();t2.start();t3.start();t4.start();t5.start();
	}
}
class Aa implements Runnable{
	@Override
	public void run() {
		synchronized(this){
			for(int x=1;x<=10;x++) {
				System.out.println(x+" "+Thread.currentThread().getName());
			}
		}
	}
}

