package com.ck;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindAStringInGivenList {
	public static List<String> findUsingLoopWithRegex(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        
        String pattern = ".*"+search+".*";
        Pattern p = Pattern.compile(pattern);
        for(String str: list) {
            if (p.matcher(str).matches()) {
                matches.add(str);
            }
        }
        return matches;
    }
	
	// useing loop
	public static List<String> findUsingLoop(String search, List<String> list) {
		List<String> matchingElements = new ArrayList<String>();
		for (String str : list) {
			if (str.contains(search)) {
				matchingElements.add(str);
			}
		}
		return matchingElements;
	}

	// useing jdk8
	public static List<String> findUsingStream(String search, List<String> list) {

		List<String> matchingElements = list.stream().filter(str -> str.trim().contains(search))
										.collect(Collectors.toList());

		return matchingElements;
	}
	

	public static void main(String[] args) {
		List<String> inputString = Arrays.asList("chuman", "kalia", "santosh");
		 
		String search = "kalia";
	
		System.out.println(findUsingLoopWithRegex(search, inputString));
		System.out.println(findUsingLoop(search, inputString));
		System.out.println("===============java 8 =======================");
		System.out.println(findUsingStream(search, inputString));
	}
}
