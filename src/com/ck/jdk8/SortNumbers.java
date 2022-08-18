package com.ck.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 23, 16, -2, 8, 0, 7, 69, 12);
		
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<Integer> sortedListDes = numbers.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(sortedListDes);
	}
}
