package com.ck.array;

import java.util.Arrays;

public class IndexOf2ndHighestNumber {

	private static int[] sortedArray(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				i = -1;
			}
		}
		return array;
	}

	private static int find2ndHighestNumberIndex(int array[]) {
		int[] sortedArray = sortedArray(array);
		return sortedArray.length - 2;
	}

	private static int findSecondHighestNumberIndex(int[] numArray) {
		int index = -1, largest = 0;

		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] > numArray[largest]) {
				index = largest;
				largest = i;
			} else if (numArray[i] != numArray[largest]) {
				if (index == -1 || numArray[i] > numArray[index]) {
					index = i;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 9, 9, 6, 9, 6, 8, 9, 4, 3 };
		System.out.println("Original array: " + Arrays.toString(array));
		int index = findSecondHighestNumberIndex(array);
		System.out.println("index of 2nd highest element: " + index);
	}
}
