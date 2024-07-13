package com.basicprograms.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> langs = new HashMap<>();
		langs.put("Java", 17);
		langs.put("Python", 10);
		langs.put("HTML", 5);
		langs.put("JavaScript", 7);
		langs.put("GoLang", 2);
		System.out.println("HashMap "+ langs);
		LinkedHashMap<String,Integer> langs1 = new LinkedHashMap<>();
		TreeMap<String,Integer> langs2 = new TreeMap<>();
		langs1.putAll(langs);
		langs2.putAll(langs);
		System.out.println("LinkedHashMap "+langs1);
		System.out.println("TreeMap "+langs2);
		
		System.out.println(langs.keySet());
		System.out.println(langs.values());
		System.out.println(langs.entrySet());

	}
}
