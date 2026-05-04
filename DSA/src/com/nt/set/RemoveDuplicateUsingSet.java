package com.nt.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 
 * 
 * 
 * Remove duplicates from an array using Set
 */
public class RemoveDuplicateUsingSet {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 2, 1, 4, 5, 4 };
		Set<Integer> ss = new HashSet<Integer>();
		for (Integer num : numbers) {
			ss.add(num);
		}
		int[] result = new int[ss.size()];
		int i = 0;
		for (Integer num : ss) {
			result[i++] = num;
		}
		System.out.println(Arrays.toString(result));
	}

}
