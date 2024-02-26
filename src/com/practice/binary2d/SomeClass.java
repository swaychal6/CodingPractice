package com.practice.binary2d;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


class A{
	
	public void show() {
		System.out.println("A");
	}
}

class B extends A{
	
	
}


public class SomeClass

{
	
	public static void main(String[] args) {
		
		String findLongestWordLength="The quick brown fox jumped over the lazy dog";
		
		String[] split = findLongestWordLength.split(" ");
		
		
		
		List<Integer> integers=new ArrayList<>();
		
		for (int i = 0; i < split.length; i++) {
			int length = split[i].length();
			integers.add(length);
		}
		
		Integer integer = integers.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		
		System.out.println(integer);
		
		
		
		int arr[] ={10,20,30,40};
		int arr2[]= {1,2,3,4,5,6};
		
		Integer array = Arrays.asList(arr,arr2).stream().flatMap(t -> Arrays.stream(t).boxed()).max((o1, o2) -> o1.compareTo(o2)).get();
		
;		System.out.println(array);

		Arrays.asList(arr,arr2).parallelStream().flatMap(t -> Arrays.stream(t).boxed()).forEach(System.out::println);
		
		
	}
}
