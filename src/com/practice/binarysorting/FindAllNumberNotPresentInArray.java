package com.practice.binarysorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindAllNumberNotPresentInArray {
	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(arr));

	}

	public static List<Integer> findDisappearedNumbers(int[] arr) {

		List<Integer> l1 = new ArrayList<>();

		int i = 0;

		while (i < arr.length) {
			int correct = arr[i]-1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index+1) {
				l1.add(index+1);
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
