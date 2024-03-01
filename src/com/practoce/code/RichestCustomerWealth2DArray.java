package com.practoce.code;

public class RichestCustomerWealth2DArray {

	public static void main(String[] args) {

		int arr[][]= {{1,5},{7,3},{3,5}};
		int result=maximumWealth(arr);
		System.out.println(result);
	}

	public static int maximumWealth(int[][] accounts) {
		int sum=0;
		int maxSum=0;

		for (int i = 0; i < accounts.length; i++) {
			
			for (int j = 0; j < accounts[i].length; j++) {
				sum+=accounts[i][j];
				if(maxSum<sum) {
					maxSum=sum;
				}
			}
			sum=0;
		}
		
		return maxSum;
	}
}
