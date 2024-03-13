package com.practice.string;

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
public class Two_String_Array_Equivalent1662 {
	public static void main(String[] args) {
		String word1[] = {"abc", "d", "defg"}, word2 []= {"abcddefg"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		String sumStr="";
		String sumStr2="";
		for (int i = 0; i < word1.length||i<word2.length; i++) {
			
			if(i<word1.length) {
				sumStr+=word1[i];
			}
			
			if(i<word2.length) {
				sumStr2+=word2[i];
			}
			
		}
		
		if(sumStr.equalsIgnoreCase(sumStr2)) {
			return true;
		}
		
		return false;
		
	}
}
