package com.ck;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromAString {

	public static void main(String[] args) {
		String strValue[] = { "spring", "hibernet", "java", "c", "java", "spring" };
		findDuplicateByLoop(strValue);
		System.out.println("___________________________");
		findDuplicateByMap(strValue);
	}

	private static void findDuplicateByMap(String[] strValue) {
		Set<String> setValue = new HashSet<>();
		for(String values : strValue) {
			if(!setValue.add(values)) {
				System.out.println(values);
			}
		}
		
		
	}

	private static void findDuplicateByLoop(String[] strValue) {
		for (int i = 0; i < strValue.length; i++) {
			for (int j = i + 1; j < strValue.length; j++) {
				if (strValue[i].equals(strValue[j])) {
					System.out.println(strValue[j]);
				}
			}
		}
	}

}
