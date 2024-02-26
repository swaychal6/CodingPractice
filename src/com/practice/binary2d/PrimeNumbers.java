package com.practice.binary2d;

import java.util.Iterator;

public class PrimeNumbers {
	public static void main(String[] args) {

		int num = 100;
		int count=0;
		int rowLimit=10;

		for (int i = 2; i < num; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					temp++;
					break;
					
				}
			}
			if (temp==0) {
				count++;
				if(rowLimit==count) {
					break;
				}
				System.out.println("Prime Numbers are:" + i);
				
			}
		}

	}

}