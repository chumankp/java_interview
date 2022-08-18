package com.ck.jdk8;

import java.util.Arrays;
import java.util.List;

public class FindAverageOfAList {
	
	private static double getAverageByloop(List<Integer> integers) {
        long sum = 0;
        for (int i: integers) {
            sum += i;
        }
        return integers.size() > 0 ? (double) sum / integers.size() : 0;
    }

	private static double getAverage(List<Integer> integers) {
		return integers.stream().mapToInt(a -> a).average().getAsDouble();
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(23, 4, 6, 7, 8, 9, 12);
		double avg = getAverage(integers);
		System.out.println(avg);
	}
}
