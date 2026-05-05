package com.nt.list;

import java.util.Arrays;
import java.util.List;

public class ReverseAList {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 3, 5);

		int size = input.size();

		for (int i = 0; i < size / 2; i++) {
			int leftIndex = i;
			int rightIndex = size - 1 - i;
			Integer temp = input.get(leftIndex);
			input.set(leftIndex, input.get(rightIndex));
			input.set(rightIndex, temp);
		}
		System.out.println(input);
	}

}
