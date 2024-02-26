package com.practice.binary.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = {1,3,4,2,2 };
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] arr) {

//		List<Integer> l1 = new ArrayList<>();

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
				return arr[index];
			}
		}
		return -1;

	}
	
	static void swap(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	} 
}
