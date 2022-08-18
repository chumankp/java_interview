package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 4, 6, 7, 8, 9, 12);
		
		List<Integer> evenNum = numbers.stream().filter(num -> num%2==0)
				.collect(Collectors.toList());
		
		List<Integer> oddNum = numbers.stream().filter(num -> num%2 !=0)
				.collect(Collectors.toList());
		
		
		System.out.println(evenNum);
		System.out.println(oddNum);
	}

}
