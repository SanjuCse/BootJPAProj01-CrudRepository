package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
	public static void main(String[] args) {
		List<String> listNames = List.of("sanju", "manda", "mahesh", "naaga", "kanhu");
		List<String> listFiltered = listNames.stream().filter(name -> name.length() == 5).collect(Collectors.toList());
		long filteredNameCount = listNames.stream().filter(name -> name.length() == 6).count();
		List<String> filteredSortedNames = listNames.stream().filter(name -> name.length() == 5).sorted()
				.collect(Collectors.toList());

		List<String> filteredSortedNames2 = listNames.stream().filter(name -> name.length() == 5)
				.sorted((str, str2) -> -str.compareTo(str2)).collect(Collectors.toList());
		System.out.println(filteredNameCount + " " + listFiltered.size());
		System.out.println(listFiltered);
		System.out.println(filteredSortedNames);
		System.out.println(filteredSortedNames2);

	}
}
