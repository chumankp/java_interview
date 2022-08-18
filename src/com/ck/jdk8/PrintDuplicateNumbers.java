package com.ck.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(23, 4, 4, 5, 5, 9, 22, 12, 12, 13, 15, 3, 4);
		
		Set<Integer>  intSet = integers.stream().filter(num -> Collections.frequency(integers, num)>1)
		.collect(Collectors.toSet());
		
		System.out.println(intSet);
		
		
		// 2nd way
		
		Set<Integer> numSet = new HashSet<Integer>();
		
		Set<Integer>  dupNum = integers.stream().filter(num -> !numSet.add(num))
		.collect(Collectors.toSet());
		
		System.out.println(dupNum);
		
		
		//find sum of all unique
		
		int uniqueNumSum  = integers.stream().distinct().mapToInt(num -> num)
				.sum();
		
		System.out.println(uniqueNumSum);
		
	}

}
