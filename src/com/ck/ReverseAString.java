package com.ck;

public class ReverseAString {
	public static void main(String[] args)
    {
        String input = "Geeks for panda";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
        
        
        reverseString(input);
    }

	private static void reverseString(String str) {

		int lengthOfString = str.length();
		
		String temp="";
		
		for(int i=lengthOfString-1; i >= 0; i--) {
			temp= temp+str.charAt(i);
		}
		System.out.println(temp);
	}
}
