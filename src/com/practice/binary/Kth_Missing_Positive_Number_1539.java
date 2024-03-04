package com.practice.binary;

public class Kth_Missing_Positive_Number_1539 {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9 };
		int k = 9;
		int result = findKthPositive(arr, k);
		System.out.println(result);
	}

	public static int findKthPositive(int[] arr, int k) {

		int i = 1;
		int insert = 0;
		int num[] = new int[k];

		for (int j = 0; j < arr.length; j++) {

			if (insert >= k) {
				break;
			}

			if (i != arr[j]) {
				num[insert] = i;
				insert++;
				j--;
			}

			i++;
		}

		if (insert>0 && insert==k) {
			return num[k - 1];
		}else {
			return arr.length + k;
		}
		
		
	}
}
