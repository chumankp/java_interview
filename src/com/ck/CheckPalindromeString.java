package com.ck;

public class CheckPalindromeString {
	public static void main(String[] args) {
		checkPalindrome("tat");
	}
	
	public static void checkPalindrome(String str) {
		String tempStr = "";
		for(int i = str.length()-1; i >= 0; --i) {
			tempStr = tempStr + str.charAt(i);
		}
		if (str.toLowerCase().equals(tempStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
	}
}
