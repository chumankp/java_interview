package com.ck;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesDuplicateElement {
	public static HashMap<Integer, Integer> findRepeating(int []arr, int size){
	    HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
	    for(int i = 0; i < size; i++)
	    {
	        if(frequency.containsKey(arr[i]))
	            frequency.put(arr[i], frequency.get(arr[i]) + 1);
	        else
	            frequency.put(arr[i], 1);
	    }
	    return frequency;
	}
	
	public static void main(String []args){
	    int []arr = {4,4,5,5,8,8,8,7,6,6,9};
	    int arr_size = arr.length;
	    HashMap<Integer,Integer> frequency = findRepeating(arr, arr_size);
	    for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
	        if (entry.getValue() > 1) 
	            System.out.println(entry.getKey()+ " --> "+entry.getValue());    
	}
}
