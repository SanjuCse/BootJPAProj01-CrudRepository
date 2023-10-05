package com.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import lombok.Builder;

public class Stream03 {
	public static void main(String[] args) {
		List<String> nameList = List.of("manhu", "manda", "sanjukta", "mahesh", "sanjay");
		List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
//		Stream<String> nameList = Stream.of("sanjay", "kanhu", "manda", "mahesh", "sanjukta");
//		List<String> list = nameList.stream().sorted((str1, str2) -> -(str1.length() - str2.length()))
//				.dropWhile(str -> str.length() > 5).collect(Collectors.toList());
//		long fiveChNames = nameList.stream().filter(str -> str.length() > 5).count();
//		List<String> list = nameList.stream().sorted((str1, str2) -> -(str1.length() - str2.length())).skip(fiveChNames)
//				.collect(Collectors.toList());

//		Object[] array = nameList.stream().filter(str -> str.length() > 5).toArray();
//		System.out.println(Arrays.toString(array));
//		System.out.println(nameList);
//		System.out.println(list);

//		Optional<Integer> array = numList.stream().filter(num -> num > 5)
//				.reduce(BinaryOperator.minBy((num1, num2) -> num1.compareTo(num2)));
//		System.out.println(array.get());
//		boolean anyMatch = nameList.stream().filter(str -> str.startsWith("ma")).noneMatch(str -> str.contains("mah"));
//		System.out.println(anyMatch);

		nameList.stream().filter(str -> str.startsWith("ma"));
//		System.out.println(findFirst.get());
	}
}
