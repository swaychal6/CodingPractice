package com.practice.binary;

public class BinarySearch {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6,55,444,888,999};
	int target=4;
	
	int binarySearch = binarySearch(arr, 888);
	
	if (binarySearch==-1) {
		System.out.println("No data found ");
	}else {
	System.out.println(binarySearch);
	}
}

static int binarySearch(int arr[],int target) {
	int start=0;
	int end=arr.length-1;
	
	while (start<=end) {
		int mid= start +(end-start)/2;
		
		if (target<arr[mid]) {
			end=mid-1;
		}else if (target > arr[mid]) {
			start=mid+1;
		}else {
			return mid;
		}
	}
	return -1;
}
}
