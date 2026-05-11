package com.nt.array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 3, 7, 5, 6, 4 };

		for (int i = 0; i <= arr.length - 1; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println(arr[j] + " ");
					isDuplicate = true;
					break;

				}
			}
			if (!isDuplicate) {
				System.out.println(arr[i]);
			}
		}

	}

}
