package com.practice.binary;

public class Pattern {
	public static void main(String[] args) {
		
//		 1
//		 2 1
//		 3 2 1
//		 4 3 2 1


		for (int i = 1; i <= 4; i++) {
//			int num=i;
			for (int j = i; j >0; j--) {
				System.out.print(" "+j);
//				num--;
			}
			System.out.println();

		}
	}
}
