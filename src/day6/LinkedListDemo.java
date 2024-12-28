package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*
		 * Array List:
		 * class that implements list interface
		 * store multiple values
		 * dynamic size
		 * 
		 * CRUD
		 * create: add
		 * Retrive: get
		 * Update: set
		 * Delete: remove
		 * 
		 * Insertion order is maintained
		 * duplicated are allowed
		 * null values are allowed
		 */

		List<Integer> al = new LinkedList<>();	
		al.add(12);
		al.add(67);
		al.add(34);
		al.add(100);
		al.add(1);
		al.add(78);
		al.add(12);
		al.add(67);
		al.add(null);
		al.add(null);
		al.addFirst(100);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//System.out.println(al.get(4));
		
		al.set(2,80);
		System.out.println(al);
		
		al.remove(9);
		al.removeLast();
		System.out.println(al);
		
		System.out.println(al.contains(781));
		
		
		for(Integer a:al) {
			System.out.println(a);
		}
	}

}
