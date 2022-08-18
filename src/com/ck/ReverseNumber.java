package com.ck;

public class ReverseNumber {
	public static void getReverseNumber(int number) {
		int temp = 0;
		while(number != 0) {
			int digit = number % 10;
			temp = temp * 10 + digit;
			number = number/10;
		}
		
		System.out.println("Reversed Number: " + temp);
	}
	
	public static void main(String[] args) {
		getReverseNumber(-123444);
	}
}
