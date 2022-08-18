package com.ck.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 23, 16, -2, 8, 7, 69, 12);
		
		int maxNum = numbers.stream().max(Comparator.comparing(Integer::valueOf))
			.get();
		
		System.out.println(maxNum);
		
		int minNum = numbers.stream().min(Comparator.comparing(Integer::valueOf))
				.get();
		
		System.out.println(minNum);

	}
}
