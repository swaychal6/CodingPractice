package com.practice.binarysorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetError {
	public static void main(String[] args) {
		int arr[] = { 1,1};
		int cyclicSort[] = setError(arr);
//		System.out.println(cyclicSort);
		System.out.println(Arrays.toString(cyclicSort));
	}

	public static int[] setError(int[] arr) {

		List<Integer> l1 = new ArrayList<>();

		int i = 0;

		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return new int[] { arr[index], index + 1 };
			}
		}
		return new int[] { -1, -1 };

	}

	static void swap(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
