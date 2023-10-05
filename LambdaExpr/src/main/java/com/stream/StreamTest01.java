package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {
	public static void main(String[] args) {
		List<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> list = integers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list);
	}
}
