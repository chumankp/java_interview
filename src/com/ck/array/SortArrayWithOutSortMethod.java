package com.ck.array;

import java.util.Arrays;

public class SortArrayWithOutSortMethod {
	
	private static int[] sortedArray(int array[]) {
		for(int i= 0 ; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i=-1;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 99, 9, 8, 7, 6, 0, 5, 4, 3 };
		System.out.println("Original array: "+ Arrays.toString(array));
		array = sortedArray(array);
		System.out.println("Sorted array: "+ Arrays.toString(array));
	}
}
