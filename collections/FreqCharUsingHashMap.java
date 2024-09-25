package com.basicprograms.collections;

import java.util.HashMap;
import java.util.Map;

public class FreqCharUsingHashMap {

	public static void main(String[] args) {

		String s = "malayalam";
		
		Map<Character,Integer> hs = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			Character ch = s.charAt(i);
			hs.put(ch, hs.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> map : hs.entrySet()) {
			
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

}
