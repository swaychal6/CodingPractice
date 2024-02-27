package com.practice.binarysorting;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 4,3,2,7,8,2,3,1};
		System.out.println(findDuplicate(arr));
	}

	public static List<Integer> findDuplicate(int[] arr) {

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
				l1.add(arr[index]);
			}
		}
		return l1;

	}

	static void swap(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
