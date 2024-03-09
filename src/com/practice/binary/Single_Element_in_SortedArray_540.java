package com.practice.binary;
//Example 1:
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//Input: nums = [3,3,7,7,10,11,11]
//Output: 10
public class Single_Element_in_SortedArray_540 {
	public static void main(String[] args) {
		
		int arr[]= {1,1,2,2,3,3,4,5,5};
		int singleNonDuplicate = singleNonDuplicate(arr);
		System.out.println(singleNonDuplicate);
	}

	public static int singleNonDuplicate(int[] nums) {
		int start=0;
		int end=nums.length-1;
		
		while(start<end) {
			int mid=start +(end-start)/2;
			
			if (nums[mid]==nums[mid+1]) {
				mid=mid-1;
			}
			
			int leftStart=(mid-start)+1;
			
			if(leftStart%2==1) {
				end=mid;
			}else {
				start=mid +1;
			}
		}
		
		return nums[end];
	}
}
