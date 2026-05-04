package com.nt.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatingElement {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 3, 5);
		Set<Integer> ss = new HashSet<Integer>();
		List<Integer> nonRepeatingOnes = new ArrayList<>();

		// Integer noReapting = null;
		for (Integer num : input) {
			if (input.indexOf(num) == input.lastIndexOf(num)) {
				nonRepeatingOnes.add(num);

			}

		}

		System.out.println("Repated");
		System.out.println(nonRepeatingOnes);

		for (Integer num : input) {
			if (input.indexOf(num) != input.lastIndexOf(num)) {
				ss.add(num);

			}

		}
		System.out.println(ss);

	}

}
