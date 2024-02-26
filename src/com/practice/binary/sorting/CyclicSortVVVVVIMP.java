package com.practice.binary.sorting;

import java.util.Arrays;

public class CyclicSortVVVVVIMP {
	
	//when we hve given range from 1-N then we are going to use cyclic sort of solving the problem.
	
	public static void main(String[] args) {
		int arr[]= {3,5,2,1,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));;
	}

	
	static void cyclicSort(int arr[]) {
		int i=0;
		
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
			
		}
	}
	
	static void swap(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
