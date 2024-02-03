package com.practice.binary;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Collecting elements into a List
        List<String> collectedList = stringList.stream()
                .collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);

        // Collecting elements into a Set
        Set<String> collectedSet = stringList.stream()
                .collect(Collectors.toSet());
        System.out.println("Collected Set: " + collectedSet);

        // Collecting elements into a Map
//        Map<Integer, String> collectedMap = stringList.stream()
//                .collect(Collectors.toMap(String::length, Function.identity()));
//        System.out.println("Collected Map: " + collectedMap);

        // Joining elements into a String
        String concatenated = stringList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated String: " + concatenated);

        // Counting the number of elements
        long count = stringList.stream()
                .collect(Collectors.counting());
        System.out.println("Count: " + count);

        // Summarizing statistics for the elements
        IntSummaryStatistics stats = stringList.stream()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("Statistics: " + stats);

        // Grouping elements by their length into a Map
        Map<Integer, List<String>> groupedByLength = stringList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by Length: " + groupedByLength);

        // Partitioning elements into two groups based on a predicate
        Map<Boolean, List<String>> partitioned = stringList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("Partitioned: " + partitioned);

        // Reducing elements using a binary operator
        String concatenatedReduced = stringList.stream()
                .collect(Collectors.reducing((s1, s2) -> s1 + s2)).orElse("");
        System.out.println("Reduced String: " + concatenatedReduced);

        // Mapping elements before collecting
        Map<Integer, List<Integer>> lengthToSquares = stringList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s.length() * s.length(), Collectors.toList())));
        System.out.println("Mapped and Grouped: " + lengthToSquares);

        // Collecting and then applying another finisher
//        List<String> collectedAndTransformed = stringList.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toList(), List::toUpperCase));
//        System.out.println("Collected and Transformed: " + collectedAndTransformed);
    }
}