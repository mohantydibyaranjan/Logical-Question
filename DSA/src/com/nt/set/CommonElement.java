package com.nt.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElement {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5, 9 };
		Integer[] arr2 = { 3, 4, 5, 6, 7, 9 };

		Set<Integer> ss = new HashSet<Integer>(Arrays.asList(arr1));
		List<Integer> list = new ArrayList<Integer>();
		for (Integer num : arr2) {
			if (ss.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(list);

	}

}
