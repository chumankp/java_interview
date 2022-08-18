package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfNumberAndAvg {
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(23, 4, 6, 7, 8, 9, 12);
		
		double dub = integers.stream().map(a->a*a).mapToInt(a->a).average().getAsDouble();
		
		System.out.println(dub);
	}

}
