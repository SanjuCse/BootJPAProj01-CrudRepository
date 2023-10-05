package com.stream2;

import java.util.List;
import java.util.stream.Collectors;

public class _3UpperToLowerStream {
	public static void main(String[] args) {
		List<String> nameList = List.of("sanju", "kanhu", "manda", "mahesh");
//		List<String> upperNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> upperNameList = nameList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());

		System.out.println(nameList);
		System.out.println(upperNameList);
	}
}
