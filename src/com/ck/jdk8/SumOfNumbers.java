package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,4,5,6,7,7,8);
		
		Optional<Integer> sum = integers.stream().reduce((a,b)->a+b);
		
		System.out.println(sum.get());
	}

}
