package com.practice.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciSeries {
	public static void main(String[] args) {
		
	int n1=0,n2=1,n3=0;
	
	System.out.print(n1 +" "+n2);
	
	for (int i=2;i<=10;i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
	}
	System.out.println();
	List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
	int product = numbers.stream().reduce(2, (a, b) -> a * b);
	System.out.println("Product: " + product);
	
	System.out.println(48*5);
	
	String s="Shubham waychal";
	
	Map<Character, Integer> map=new HashMap<>();
	
				
	}
}
