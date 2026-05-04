package com.nt.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepeatingElement {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 3, 5);
		List<Integer> nonRepeatingOnes = new ArrayList<>();

		// Integer noReapting = null;
		for (Integer num : input) {
			if (input.indexOf(num) == input.lastIndexOf(num)) {
				nonRepeatingOnes.add(num);

			}

		}
		System.out.println(nonRepeatingOnes);

	}

}
