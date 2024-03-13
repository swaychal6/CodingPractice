package com.practice.string;

public class String_Array_Reverse {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";

		String[] split = s.split(" ");
		String ss = "";

		for (int i = 0; i < split.length; i++) {
			StringBuilder strbuff = new StringBuilder();
			ss += strbuff.append(split[i]).reverse();

			if (i < split.length - 1) {
				ss += " ";
			}

		}
		System.out.println(ss);

	}
}
