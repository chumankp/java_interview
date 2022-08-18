package com.ck;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaysToIterateList {
	
	/**
     * Iterate over a list using a basic for loop
     */
	public static void iterateWithForLoop(List<String> strings) {
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}
	
	/**
     * Iterate over a list using the enhanced for loop
     */
    public static void iterateWithEnhancedForLoop(List<String> strings) {
    	for(String str : strings) {
    		System.out.println(str);
    	}
    	
    }
	
    /**
     * Iterate over a list using an Iterator
     */
    public static void iterateWithIterator(List<String> strings) {
    	Iterator<String> iterator = strings.iterator();
    	//ListIterator<String> listIterator = countries.listIterator();
    	while(iterator.hasNext()) {
    		System.out.println(iterator.next());
    	}
    }
    
    /**
     * Iterate over a list using the Iterable.forEach() method
     */
    public static void iterateWithForEach(List<String> strings) {
    	strings.forEach(System.out::println);
    }

    /**
     * Iterate over a list using the Stream.forEach() method in java 8
     */
    public static void iterateWithStreamForEach(List<String> strings) {
    	strings.stream().forEach((str) -> System.out.println(str));
    }
    
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
		iterateWithForLoop(countries);
		iterateWithEnhancedForLoop(countries);
		iterateWithIterator(countries);
		iterateWithForEach(countries);
		iterateWithStreamForEach(countries);
	}

}
