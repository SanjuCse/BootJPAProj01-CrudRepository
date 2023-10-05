package com.stream2;

import java.util.List;
import java.util.stream.Collectors;

public class _6CountStringStartsWithStream {
	public static void main(String[] args) {
		List<String> nameList = List.of("sanjay", "kanhu", "manda", "mahesh", "sanjukta");
		String startsWith = "san";
		List<String> startsWithList = nameList.stream().filter(str -> str.startsWith(startsWith))
				.collect(Collectors.toList());
		System.out.println("Person Names starts with " + startsWith + " are " + startsWithList + " and their count is "
				+ startsWithList.size());
	}
}
