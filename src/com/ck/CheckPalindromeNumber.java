package com.ck;

public class CheckPalindromeNumber {
	public static void checkPalindromeNumber(int nubmer) {
		int reversedNum = 0, remainder;
		int orgNumber = nubmer;
		while (nubmer != 0) {
		      remainder = nubmer % 10;
		      reversedNum = reversedNum * 10 + remainder;
		      nubmer /= 10;
		    }
		
		if (orgNumber == reversedNum) {
		      System.out.println(orgNumber + " is Palindrome.");
		    }
		    else {
		      System.out.println(orgNumber + " is not Palindrome.");
		    }
	}
	public static void main(String[] args) {
		checkPalindromeNumber(121);
	}
}
