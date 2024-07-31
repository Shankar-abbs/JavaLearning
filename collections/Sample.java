/*

package com.basicprograms.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(1,0,2,4));
		LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(9,6,8));
		System.out.println(Sample.sum(l1, l2));
	}
	public static List<Integer> sum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
		int carry=0,sum;
		LinkedList<Integer> ll = new LinkedList<>();
		int big = (l1.size()>l2.size()?l1.size():l2.size());
		for(int i=0;i<big;i++) {
			if(l1.size()>i && l2.size()>i) {
				sum = (int)l1.get(i)+(int)l2.get(i);
				if(sum>9) {
					ll.add(big-i-1,sum%10+carry);
					carry = 1;
				}
				else {
					ll.add(big-i-1,sum+carry);
					carry = 0;
				}
			}
		}
		return ll;
	}
}
*/
package com.basicprograms.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(1, 0, 2, 4));
        LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(9, 6, 8));
        System.out.println(Sample.sum(l1, l2));
    }

    public static List<Integer> sum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int carry = 0, sum;
        LinkedList<Integer> ll = new LinkedList<>();
        int i = 0;

        while (i < l1.size() || i < l2.size()) {
            int digit1 = (i < l1.size()) ? l1.get(i) : 0;
            int digit2 = (i < l2.size()) ? l2.get(i) : 0;

            sum = digit1 + digit2 + carry;
            carry = sum / 10;
            ll.add(sum % 10);

            i++;
        }

        if (carry != 0) {
            ll.add(carry);
        }

        return ll;
    }
}


