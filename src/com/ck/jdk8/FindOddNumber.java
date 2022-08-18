package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddNumber {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);

		List<Integer> oddNumbers = integers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

		System.out.println(oddNumbers);

		List<Integer> evvenNumbers = integers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evvenNumbers);
	}
}
