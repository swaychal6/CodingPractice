package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int[] array = Arrays.stream(arr).mapToInt(value -> Arrays.stream(value).sum()).toArray();
		
		System.out.println(Arrays.toString(array));
		
		int asInt = Arrays.stream(array).max().getAsInt();
		
		System.out.println(asInt);
		
		int findTotalMax = findTotalMax(arr);
		System.out.println(findTotalMax);
		
		int s[]={ 7, 8, 9 ,9,8,9,9,7};

		int[] array2 = Arrays.stream(s).sorted().distinct().toArray();
		
		 
		System.out.println("Max no is: "+Arrays.toString(array2));
		
		Map<Integer, Long> collect = Arrays.stream(s).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(collect);
		
		int num[]= {12,345,1245,666};
		int count=0;
		for (int i : num) {
			
			String valueOf = String.valueOf(i);
			int length=valueOf.length();
			if(length%2==0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		boolean anyMatch = Arrays.stream(arr).flatMapToInt(t -> IntStream.of(t)).anyMatch(value -> value == 5);

		int [] target = findTargetFrom2d(arr, 5);
		System.out.println(Arrays.toString(target));
	}

	private static int findTotalMax(int[][] arr) {
		Map<Integer, Integer> map=new HashMap<>();
//		int tottalElementCount=0;
		int sum=0;
		// TODO Auto-generated method stub
		if (arr.length==0) {
			return -1;
		}
		
		for (int row = 0; row < arr.length; row++) {
			sum=0;
			
			for (int col=0;col<arr[row].length ; col++) {
				sum=sum+arr[row][col];
				map.put(row, sum);
			}
				
		}
		
		Entry<Integer, Integer> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		return entry.getValue();
		 		
	
	}

	static int [] findTargetFrom2d(int[][] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == target) {
					return new int [] {i,j};
				}
			}

		}
		return new int [] {-1,-1};
	}
}
