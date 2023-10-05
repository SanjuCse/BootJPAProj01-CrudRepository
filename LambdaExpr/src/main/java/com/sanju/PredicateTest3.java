package com.sanju;

import java.util.function.Predicate;

public class PredicateTest3 {
	public static void main(String[] args) {
//		Predicate<Integer> predicate = number -> number > 10;
//		Predicate<Integer> predicate = number -> number % 2 == 0;
		Predicate<String> predicate = str -> str.length() >= 3;
		System.out.println(predicate.test("ab"));
	}
}
