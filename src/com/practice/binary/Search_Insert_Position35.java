package com.practice.binary;
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class Search_Insert_Position35 {
public static void main(String[] args) {
	int arr[]= {1,3,5};
	int searchInsert = searchInsert(arr, 4);
	System.out.println(searchInsert);
}

public static  int searchInsert(int[] nums, int target) {
    
	int start=0;
	int end=nums.length-1;
	
	if(target<nums[start]) {
		return 0;
	}
	if(target>nums[end]) {
		return nums.length;
	}
	while(start<end) {
		
		
		int mid=start+(end-start)/2;
		
		if(nums[mid]==target) {
			return mid;
		}
		
		if(nums[mid]<target) {
			start=mid+1;
		}else {
			end=mid;
		}
	}
	
	
	
	return start;
	
	
}
}
