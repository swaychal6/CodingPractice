package com.practice;

import java.util.Arrays;

public class RotateArray {
public static void main(String[] args) {
	RotateArray array=new RotateArray();
	 int [] arr= {5,46,54,1,23,12,15,45,115};
	 
//	 output--- [1, 23, 12, 5, 46, 54]
	 
	 System.out.println(Arrays.toString(arr));
	array.rotate(arr, 4);
	
	System.out.println(Arrays.toString(arr));
}
 
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
        reverseNum(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
        reverseNum(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }
    
    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

