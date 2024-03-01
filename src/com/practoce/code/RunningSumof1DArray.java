package com.practoce.code;

import java.util.Arrays;

public class RunningSumof1DArray {
	public static void main(String[] args) {

		int arr[]= {1,2,3,4};
		int[] runningSum = runningSum(arr);
		System.out.println(Arrays.toString(runningSum));
	}

	public static int[] runningSum(int[] nums) {
		int arr[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j >= 0; j--) {
				sum += nums[j];
			}
			arr[i]=sum;
		}
		
		return arr;
	}
}
