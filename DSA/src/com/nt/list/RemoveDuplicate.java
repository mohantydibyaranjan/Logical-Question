package com.nt.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 3, 5);
		Set<Integer> ss = new LinkedHashSet<Integer>(input);
		List<Integer> result = new ArrayList<Integer>(ss);
		System.out.println(input);
		System.out.println(result);

	}
}
