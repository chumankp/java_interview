package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumber {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(23, 4, 6, 7, 8, 9, 12);
		
		List<Integer> limitNumber = integers.stream().limit(5).collect(Collectors.toList());
		
		System.out.println(limitNumber);
		
		//sum of first 5 number in the list
		
		int addLimitNumber = integers.stream().limit(5).reduce((a,b)-> a+b).get();
		
		System.out.println(addLimitNumber);
	}
}
