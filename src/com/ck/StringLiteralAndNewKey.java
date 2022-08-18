package com.ck;

public class StringLiteralAndNewKey {
	public static void main(String[] args) {
		String str1= "Abc";
		String str2= "Abc";
		String str3 = new String("Abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
