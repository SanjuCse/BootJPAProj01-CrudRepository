package com.stream2;

import java.util.List;
import java.util.stream.Collectors;

public class _5RemoveDuplicateStream {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 6, 1, 3, 4, 2, 5);
		List<Integer> listWithoutDiplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list.getClass());
		System.out.println(listWithoutDiplicate);
	}
}
