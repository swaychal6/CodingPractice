package com.practice.binarysorting;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 4, 2,1 ,0};
		int cyclicSort = cyclicSort(arr);
		System.out.println(cyclicSort);
		System.out.println(Arrays.toString(arr));
	}

	static int cyclicSort(int arr[]) {

		int i = 0;

		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i]<arr.length && arr[i] != arr[correct]) {
				swap(arr,i,correct);
			} else {
				i++;
			}

		}
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index]!=index) {
				return index;
			}
		}
		return arr.length;

	}

	static void swap(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

}
