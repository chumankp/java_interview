package com.ck.array;


public class ArraySearch {
		public static void main(String[] args) {
			int a1[] = new int[] {3,6,2,9,5,8,1};
			int indexValue=search(a1, 4);
			if(indexValue == -1) 
				System.out.println("Element not found");
			else
				System.out.println("Element Found at position = "+indexValue);
		}
		
		private static int search(int array[], int searchValue) {
			for(int i = 0; i<array.length; i++) {
				if(array[i]==searchValue) 
					return i;
				}
			return -1;
		}
}
