package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
	public static void main(String[] args) {
		List<String> listNames = List.of("sanju", "manda", "mahesh", "naaga", "kanhu");
		List<String> collect = listNames.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}