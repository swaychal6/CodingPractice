package com.practice.binary;

public class BinarySearchByOwn {
	public static void main(String[] args) {

		int arr[] = { 12, 10, 9, 7, 6, 4, 3, 2, 1 };
		int arr1[] = { 1, 2, 4, 6, 7, 8, 9, 12, 34, 55, 66, 77 };
		int target = 9;
		int answer = binarySearch(arr1, target);
		System.out.println(answer);

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;

		boolean isAscending = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}

			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return -1;
	}
}
