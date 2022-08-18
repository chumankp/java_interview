package com.ck;

public class NumberofOccurences {
	 public static void main(String args[])
	  {
	      
	  String input = "wipro technologies";
	  char search = 'o';             // Character to search is 'a'.
	  
	  //Example 1
	  long count = input.chars().filter(ch -> ch == search).count();
	  // chars() method return integer representation of codepoint values of the character stream
	  System.out.println("The Character '"+search+"' appears "+count+" times.");
	
	  //Example 2
	  count = input.codePoints().filter(ch -> ch == search).count();
	  // codePoints() just return the actual codepoint or Unicode values of the stream.
	  System.out.println("The Character '"+search+"' appears "+count+" times.");
	
	  int count1=0;
	  for(int i=0; i<input.length(); i++)
	  {
	      if(input.charAt(i) == search)
	      count1++;
	  }
	  
	  System.out.println("The Character '"+search+"' appears "+count1+" times.");
	  }
}
