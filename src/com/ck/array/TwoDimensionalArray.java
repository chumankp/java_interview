package com.ck.array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] a1 = new int[3][4];
		int count = 0;
		for(int i = 0; i < a1.length; i++) {
			for(int j=0; j < a1[i].length; j++) {
				a1[i][j] = count;
				count++;
			}
		}
		//display
		for(int i = 0; i < a1.length; i++) {
			for(int j=0; j < a1[i].length; j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
