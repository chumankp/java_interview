package com.ck;

public class SegregateNumbers0sand1s {
	
	public static void segregate0and1(int arr[], int n) {
		
		int count = 0; // counts the no of zeros in arrays
		for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
	  
		
		  // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++) {  
            arr[i] = 0;
            
        }
        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++) 
            arr[i] = 1;
        
        print(arr, n);
	}
	
	 // function to print segregated array
   private static void print(int arr[], int n)
    {
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + ",");   
    }
    
	public static void main(String[] args) {
		int arr[] = new int[]{ 0, 1, 0, 1, 1, 01, 0, 10, 11};
		int n = arr.length;
		segregate0and1(arr, n);
	}

}
