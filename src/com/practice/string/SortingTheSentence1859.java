package com.practice.string;

import java.util.Arrays;

//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions
//"This1 is2 a3 sentence4", then remove the numbers.
public class SortingTheSentence1859 {
	public static void main(String[] args) {
		String ss1 = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(ss1));
	}

	public static String sortSentence(String s) {

		String[] arr = s.split(" ");

		StringBuilder builder = new StringBuilder();
//		String substring = arr[1].substring(arr[1].length()-1, arr[1].length());

		int i = 0;

		while (i < arr.length) {
//			int correct=arr[i]-1;
//			int correct=Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
			String substring = arr[i].substring(arr[i].length() - 1, arr[i].length());
			System.out.println(substring);
			int currentInd = Integer.parseInt(substring);
			int correctInd = currentInd - 1;
			if (correctInd != i) {
				swap(arr, i, correctInd);
			} else {
				i++;
			}

		}

		for (int j = 0; j < arr.length; j++) {
			builder.append(arr[j].subSequence(0, arr[j].length() - 1));

			if (j < arr.length - 1) {
				builder.append(" ");
			}
		}

		return builder.toString();
	}

	static void swap(String[] arr, int first, int last) {
		// TODO Auto-generated method stub
		String temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

}
