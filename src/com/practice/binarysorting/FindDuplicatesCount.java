package com.practice.binarysorting;

public class FindDuplicatesCount {
	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}

	static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

}