package com.practice.binary;
//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15
public class Subtract_Product_and_Sum_Digits_of_an_Integer1281 {
	public static void main(String[] args) {
		int num=234;
		System.out.println(subtractProductAndSum(num));
	}

	public static int subtractProductAndSum(int n) {
		int product=1;
		int sum=0;
		while(n>0) {
			
			int num=n%10;
			
			product*=num;
			sum+=num;
			
			n=n/10;			
		}
		
		
		return product-sum;
	}
}
