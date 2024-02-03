package com.practice.binary;

public class SearchInRotateBinaryPractice {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 5,5,5,7, 9, 8, 6, 5, 4,4,4,4,3, 2 };
		
		System.out.println(findPivotInDuplicateElementArray(arr));
	}

//This code is use for searching pivot if the array does not contais duplicate elements 
	static int showPivotInNormalMountainArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

//This code is use for searching pivot if the array contains the duplicate elements 
	static int findPivotInDuplicateElementArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]  && arr[mid]>arr[mid-1]) {
				return mid;
			}

			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

				if (start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
				
				if (end > start && arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;

			} else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
