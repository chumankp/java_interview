package com.ck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumberFromListWhereNumberStartWithOne {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(11, 10, 12, 101, 141, 67, 7, 1, 88, 1000);
		List<String> intString = new ArrayList<String>();

		for (int i : number) {
			intString.add(String.valueOf(i));
		}
		for (String element : intString) {
			if (element.startsWith("1"))
			System.out.println(element);
		}

		intString = number.stream().map(String::valueOf).filter(str -> str.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(intString);

	}
}
