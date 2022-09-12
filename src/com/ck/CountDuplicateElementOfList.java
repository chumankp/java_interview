package com.ck;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateElementOfList {

	public static Map<String, Integer> findNumberOfDuplicateElement(List<String> listOfString) {
		Map<String, Integer> mapOfString = new HashMap<>();
		for(String str : listOfString) {
			mapOfString.put(str, mapOfString.getOrDefault(str, 0)+1);
		}
		return mapOfString;
	}
	
 
	//by java 8
	public static Map<String, Integer> findNumberOfDuplicateElementByJava8(List<String> listOfString) {
		Map<String, Integer> map = listOfString.stream()
				.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
		return map;
	}
	

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "a", "c", "d", "b", "a");
		System.out.println(findNumberOfDuplicateElement(list));
		System.out.println(findNumberOfDuplicateElementByJava8(list));
	}
}
