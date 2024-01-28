package com.practice;

public class SearchInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 4,5,6,7,0,1,2};
		int ans = peakIndexInMountainArray(arr);
		int binarySearch = binarySearch(arr, 5, 0, ans);

		int binarySearch2 = binarySearch(arr, 5, ans, arr.length - 1);

		System.out.println(binarySearch + ":" + binarySearch2);
	}
	
	int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return binarySearch(arr, target, peak+1, arr.length - 1);
    }

	static int binarySearch(int[] arr, int target, int start, int end) {

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

	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				// you are in asc part of array
				start = mid + 1; // because we know that mid+1 element > mid element
			}
		}
		return start;
	}
}
