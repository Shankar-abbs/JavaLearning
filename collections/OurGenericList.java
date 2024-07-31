package com.basicprograms.collections;

public class OurGenericList<T> {

	private T[] items;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OurGenericList() {
		size=0;
		items = (T[])new Object[100];
	}
	
	public void add(T item) {
		items[size ++] = item;
	}
	public T gettAtIndex(int index) {
		
		return items[index];
	}
}
