package com.ck;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList( 2, 3, 4, 5,6, 7, 8, 9,10);
		findMissingNumber(numberList, 1, 10);
	}

	private static void findMissingNumber(List<Integer> numberList, int minNumber, int maxNumber) {
		int tempSum = 0, maxSum = 0;
		for (int i = 0; i < numberList.size(); i++) {
			tempSum = tempSum + numberList.get(i);
		}

		for (int j = minNumber; j <= maxNumber; j++) {
			maxSum = maxSum + j;
		}

		System.out.println("missing number :- " + (maxSum - tempSum));
	}

}
