package com.practice.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factorial {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

//	Scanner sc=new Scanner(System.in);
//	int i = sc.nextInt();
		int fact = 1;
//	for(int j=1;j<=i;j++) {
//		fact=fact*j;
//	}
//	
//	System.out.println(fact);

		int arr[] = { 12, 21, 22, 22, 233, 33, 555, 79 };
		
//		List<Integer> list2 = Arrays.stream(arr).boxed().toList();
		
		Collections.shuffle(Arrays.asList(arr));
		
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println(Arrays.toString(arr));
		
		 Integer integer = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		 
		System.out.println(integer);
		
		List<Integer> collect4 = Arrays.stream(arr).boxed().map(t -> t*t).collect(Collectors.toList());
		
		System.out.println(collect4);

		Map<Integer, Long> collect2 = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Integer collect = Arrays.stream(arr).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst()
				.get();

		System.out.println(collect2);
		System.out.println(collect);

		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Shubham", "Akshada", "Akshata", "Saurav");
		
		 Map<String, Long> collect3 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect3);

		list.forEach(t -> {
			long count = t.toLowerCase().chars().filter(value -> value == 'a').count();
			System.out.println("Number of occurences find in a " + t + " is :" + count);
		}

		);
		
		

        int k = 3;
        Integer[] intArray = {1, 2, 3, 4, 7, 8, 9};

        // Convert Integer array to linked list using Java 8
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(intArray));

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Rearrange linked list in-place without creating a new array
        int size = linkedList.size();
        for (int i = 0; i < k; i++) {
            linkedList.add(0, linkedList.remove(size - 1));
        }

        // Print the rearranged linked list
        System.out.println("Rearranged Linked List: " + linkedList);
    }
		
		
//		Factorial.sort(k, arr1);
//	System.out.println(count);
	}
	
//	public static int []  sort(int reverseTillIndex, int arr[]) {
//		
//		return null;	
//	}

