package com.ck.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetSecondHighestOrLowest {
	
	public static void main(String[] args) {
		
	
	List<Integer> numbers = Arrays.asList(23, 4, 6, 7, 8, 9, 12);
	
	int secondHighestNumber= numbers.stream().sorted(Collections.reverseOrder())
			.skip(1).findFirst().get();
	
	System.out.println(secondHighestNumber);
	
	}

}
