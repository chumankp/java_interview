package com.ck.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(34);
		list.add(3);
		list.add(5);
		list.add(87);
		
		System.out.println(list);
		
		/*
		 * list.remove(1); System.out.println(list);
		 */
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
