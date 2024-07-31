package com.basicprograms.collections;

import java.util.HashMap;
import java.util.Map;

public class Twosum {
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,9,13};
		Leet1 ts = new Leet1();

		for(int t:ts.twosum(arr, 7)) {
			System.out.print(t+" ");
		}
	}
}
class Leet1{
	
	int[] twosum(int[]a , int target) {
		//[2,5,7,9,13] t=9
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++){
			int complement = target-a[i];
			if(map.containsKey(complement)) 
				return new int[] {map.get(complement),i};
			map.put(a[i],i);
		}
		return new int[0];
	}
}