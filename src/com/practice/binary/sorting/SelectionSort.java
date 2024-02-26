package com.practice.binary.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		 int []arr= {8,-55,25,22,1};
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int last = arr.length - i - 1;

			int maxIndex = getMaxIndex(arr, 0, last);

			swapped(arr, maxIndex, last);
		}
	}

	static void swapped(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;                 
	}

	static int getMaxIndex(int arr[], int start, int end) {
		// TODO Auto-generated method stub
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
}