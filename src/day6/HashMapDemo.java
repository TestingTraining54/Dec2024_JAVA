package day6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
/*
 * combination of key and value - entry/bucket/key-value pair
 * combination of all key-value pair -- entryset
 * 12 --- qwe
 * do not maintain insertion order
 * it does not allow duplicate key, act as updation in case we are inserting a duplicate key
 * it allows duplicate values
 */
	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(12, "abc");
		hm.put(11,"xyz");
		System.out.println(hm);
		hm.put(12, "qwe");
		System.out.println(hm);
		hm.put(45,"xyz");
		System.out.println(hm);
		
		System.out.println(hm.containsKey(12));
		System.out.println(hm.containsValue("abc"));
		
		for(Entry<Integer,String> h:hm.entrySet()) {
			System.out.println(h.getKey()+ "---" + h.getValue());
			//System.out.println(h.getValue());
		}
		
		Set<Integer> allKey = hm.keySet();
		System.out.println(allKey);
		Collection<String> allValue = hm.values();
		System.out.println(allValue);
		
		
		/*
		 * String str = "selenium"
		 * s - 1
		 * e - 2
		 * l - 1
		 * n - 1
		 * 1.Frequency of characters in a string
		 * 
		 * 2. Get the characters which are duplicate in a particular string 
		 * 
		 * charAt(0) -- s
		 * Character - key
		 * Integer - -value
		 */
		
	}

}
