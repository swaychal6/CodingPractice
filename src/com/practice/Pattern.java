package com.practice;

public class Pattern {
	public static void main(String[] args) {
		
//		 1
//		 2 1
//		 3 2 1
//		 4 3 2 1


		for (int i = 1; i <= 4; i++) {
			int num=i;
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+num);
				num--;
			}
			System.out.println();

		}
	}
}
