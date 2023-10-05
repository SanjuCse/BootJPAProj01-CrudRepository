package com.stream;

import java.util.List;

public class StreamTest04 {
	public static void main(String[] args) {
		List<String> listNames = List.of("sanju", "manda", "mahesh", "naaga", "kanhu");
		List<Integer> listNums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 8);
		String minName = listNames.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		Integer minNum = listNums.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		Integer maxNum = listNums.stream().min((s1, s2) -> -s1.compareTo(s2)).get();
		System.out.println(minName);
		System.out.println(minNum);
		System.out.println(maxNum);

	}
}
