package com.practice;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkListDescending {
	public static void main(String[] args) {

//		LinkedList<Integer> t = new LinkedList<>();
		TreeSet<Integer>t=new TreeSet<>();
		
		t.add(50);
		t.add(50);
		t.add(50);
		t.add(5054);
		t.add(506);
		t.add(550);
		t.addAll(t);
		System.out.println(t);
//		t.descendingIterator().forEachRemaining(t -> System.out.println(t));
	}
}
