package com.ck;

public class FindFactorialOfANumber {

	public static void findFactorialOfANumber(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial*i;
		}
		System.out.printf("Factorial of %d = %d", number, factorial);
	}

	public static void main(String[] args) {
		findFactorialOfANumber(18);
	}
}
