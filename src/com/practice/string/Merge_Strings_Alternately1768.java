package com.practice.string;

//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
public class Merge_Strings_Alternately1768 {
	public static void main(String[] args) {
		String word1 = "abcd", word2 = "pq";
		System.out.println(mergeAlternately(word1, word2));
	}

	public static String mergeAlternately(String word1, String word2) {

		String newStr = "";

		for (int i = 0; i < word1.length() || i < word2.length(); i++) {

			if (i < word1.length() && i < word2.length()) {
				newStr += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
			} else 
				if (i < word2.length() ) {
				newStr += String.valueOf(word2.charAt(i));
			} else 
				if (i < word1.length()) {
				newStr += String.valueOf(word1.charAt(i));
			}
		}

		return newStr;
		
		//2nd easy solution 

//        StringBuilder str = new StringBuilder();
//        int i = 0;
//        while (i < word1.length() || i < word2.length()) {
//            if (i < word1.length()) {
//                str.append(word1.charAt(i));
//            }
//            if (i < word2.length()) {
//                str.append(word2.charAt(i));
//            }
//            i++;
//        }
//        return str.toString();
	}
}
