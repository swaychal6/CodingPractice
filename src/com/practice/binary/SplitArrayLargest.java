package com.practice.binary;

public class SplitArrayLargest {
public static void main(String[] args) {
	int arr[]= {7,2,5,8,10};
	
	System.out.println(splitArray(arr, 2));
}

static int splitArray(int nums[], int m) {
	
	int start =0;
	int end=0;
	
	for (int i = 0; i < nums.length; i++) {
		start=Math.max(start, nums[i]);
		end+=nums[i];
	} 
	
	while (start<end) {
		
		int mid =start +(end-start)/2;
		
		//calculate how many peices we can divide this is with the max sum 
		int sum=0;
		int pieces=1;
		
		for(int num:nums) {
			
			if (sum+num >mid) {
				// 
				sum=num;
				pieces++;
			}else {
				sum+=num;
			}
		}
		
		if (pieces>m) {
			start=mid+1;
		}else {
			end=mid;
		}
	}
	
	return start;
}

}
