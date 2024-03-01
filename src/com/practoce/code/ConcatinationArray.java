package com.practoce.code;

import java.util.Arrays;

//1929. Concatenation of Array
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
public class ConcatinationArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 1 };
		int[] concatenation = getConcatenation(arr);
		System.out.println(Arrays.toString(concatenation));
	}

	static int[] getConcatenation(int[] nums) {

		int concat[] = new int[nums.length * 2];
		int i = 0;
		int j = 0;
		while (j < concat.length) {

			if (i < nums.length) {
				concat[j] = nums[i];
				i++;
			} else {
				i = 0;
				j--;
			}
			j++;
		}

		return concat;
	}
}
