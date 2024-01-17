package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GroupingJava8 {
	public static void main(String[] args) {

		int arr[] = { 12, 32, 151, 55, 44, 88, 55 };

		String s = "shubham";
		String a = "mabhshu";

		char[] charArray = s.toLowerCase().toCharArray();
		char[] charArray2 = a.toLowerCase().toCharArray();

		Arrays.sort(charArray2);
		Arrays.sort(charArray);

		boolean equals = Arrays.equals(charArray, charArray2);
		
		if(equals) {
			System.out.println("String is anagram");
		}else {
			System.out.println("String is not anagram");
		}

		List<Integer> list = new ArrayList<>();

		Map<String, Integer> map = new HashMap<>();
		map.put("Shubham", 22);
		map.put("Saurav", 23);
		map.put("Sakshi", 23);
		map.put("Sharu", 22);
		map.put("Vaibhav", 26);
		map.put("Akshata", 27);

		Map<Integer,List<Entry<String,Integer>>> collect = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));

		Optional<Entry<String, Integer>> max = map.entrySet().stream()
				.max((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		System.out.println(max);

		System.out.println(collect);

		List<Integer> collect2 = Arrays.stream(arr).skip(0).limit(3).boxed().collect(Collectors.toList());

		System.out.println(collect2);

	}
}
