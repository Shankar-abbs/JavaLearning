package com.basicprograms.collections;

import java.util.*;
public class MapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		Map<Integer,String> map = new Hashtable<>();
		map.put(1,"Java");
		map.put(2,"Python");
		map.put(32,"Go");
		map.put(4,"JavaScript");
		map.put(5,"CPP");
		map.put(61,"TypeScript");
		Collection c =map.values();
		System.out.println(c);
		Set s1 = map.keySet();
		System.out.println(s1);
		Set s2 = map.entrySet();
		System.out.println(s2);
	}

}
