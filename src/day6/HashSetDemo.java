package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * Set - will not allow duplicate values
		 * Hashing mechanism - will not maintain any order of insertion.
		 * 
		 * 
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(67);
		hs.add(89);
		hs.add(90);
		hs.add(12);
		hs.add(67);
		hs.add(89);
		hs.add(100);
		hs.add(23);
		System.out.println(hs);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer i:hs) {
			System.out.println(i);
		}
				
		
	}

}
