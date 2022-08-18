package com.ck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOf2ndHightNumber {
	public static void main(String[] args) {
		
		int[] array= {25,675112,44,50,74,9454};
		System.out.println(getIndexOF2ndHightsValue(array));
		
	}
	
	private static Integer getIndexOF2ndHightsValue(int[] intArray) {
		List<Integer> integers = new ArrayList<Integer>();
		for(int i : intArray) {
			integers.add(i);
		}
		Arrays.sort(intArray);
		return integers.indexOf(intArray[intArray.length-2]);
		
	}

}
