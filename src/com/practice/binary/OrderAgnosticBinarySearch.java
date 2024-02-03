package com.practice.binary;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {

		int arr[]= {45,33,22,17,14,12,8,7,5,3,1};
		int arr1[]= {1,2,3,4,5,6,55,444,888,999};
		int target=4;
		
		int num=agnotsticBinarySearch(arr1 , 13);
		System.out.println(num);
	}
	

	static int agnotsticBinarySearch(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsync = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsync) {

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
