package com.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveLeadingZero {
public static void main(String[] args) {
	
	String a="  sbhbhs";
	
	 a.trim();	
	System.out.println(a.trim());
	
	
	int arr[]= {12,14,10,2,25};
	
	 int findFirst = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	
	System.out.println(findFirst);
	
	
	Map<String, Integer> scores = new HashMap <>();

	scores.put("David", 95);
	scores.put("Jane", 80);
	scores.put("Mary", 97);
	scores.put("Lisa", 78);
	scores.put("Dino", 65);

 Stream<Entry<String, Integer>> sorted = scores.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
	
	System.out.println(sorted.toList());	
	
	String s="sbxkbnakkbaskbaaaa";
	
	s = s.replace("a", "");
	System.out.println(s);
	
	
	 List<Entry<String, Integer>> collect = scores.entrySet().stream().max((o1, o2) ->o1.getValue().compareTo(o2.getValue())).stream().collect(Collectors.toList());
		 
	 System.out.println(collect);

}
}
