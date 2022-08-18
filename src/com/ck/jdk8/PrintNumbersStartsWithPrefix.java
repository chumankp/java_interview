package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbersStartsWithPrefix {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23, 43, -26, 67, 28, 79, 212, 20, 202, 02);
		
		List<Integer> filterNum = numbers.stream().map(num -> String.valueOf(num))
				.filter(num->num.startsWith("2") || num.startsWith("-2"))
				.map(Integer :: valueOf)
				.collect(Collectors.toList());
		
		System.out.println(filterNum);
	}

}
