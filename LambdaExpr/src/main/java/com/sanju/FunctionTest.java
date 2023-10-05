package com.sanju;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 451, 3435, 64 };
//		Function<String, Integer> function = str -> str.length();
		Function<String, Boolean> function = str -> str.isEmpty();
		System.out.println(function.apply(""));
	}
}
