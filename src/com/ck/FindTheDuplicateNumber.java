package com.ck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDuplicateNumber {
	
	public static void findDuplicateByJdk7(List<Integer> numbers) {
		Set<Integer> uniqueNumbers = new HashSet<>();
		for(Integer num : numbers) {
			if (!uniqueNumbers.add(num)) {
				System.out.println("Duplicate numbers : - "+num);
			} 
		}
	}
	
	public static void findDuplicateByJdk8(List<Integer> numbers) {
		Set<Integer> uniqueNumbers = new HashSet<>();
		List<Integer> numList = numbers.stream().filter(num -> !uniqueNumbers.add(num))
		.collect(Collectors.toList());
		System.out.println("Duplicate numbers : - "+numList);
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,20,30,40,50,40,30,50,60,70,80);
		findDuplicateByJdk7(numbers);
		
		System.out.println("---------------JDK-8---------------");
		
		findDuplicateByJdk8(numbers);
	}
	
}
