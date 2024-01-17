package com.practice;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	
	int arr[]= {10,12,0,15,48,96};
	
//	@Arrays.sort(arr);
	
	for (int i = 0; i < arr.length; i++) {
		
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			}
			
		}
		
	}
	
	
	
	System.out.println(Arrays.toString(arr));
}
}
