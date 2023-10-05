package com.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(1);
		list.add(3); // (3, 1, 6, 1, 3, 4, 2, 5);
		list.add(4);
		list.add(2);
		list.add(5);

		Stream<Integer> stream = Stream.of(3, 1, 6, 1, 3, 4, 2, 5);
//		List<Integer> list2 = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//		list.stream().filter(num -> num % 2 == 0).forEach((num2) -> System.out.println(num2));
//		List<Integer> list2 = list.stream().filter((num) -> num > 3).collect(Collectors.toList());
//		Integer minOfList = list.stream().max((num1, num2) -> num1.compareTo(num2)).get();
//		List<Integer> list2 = list.stream().map((num) -> num * 2).collect(Collectors.toList());
//		System.out.println(minOfList);

//		int size = list.size();
//		long count = list.stream().distinct().count();
//		System.out.println("Actual size " + size + "\ndistinct size " + count);
//		List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
//		List<Integer> list3 = list.stream().sorted((num1, num2) -> -num1.compareTo(num2)).collect(Collectors.toList());
//		List<Integer> list3 = list.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(list);
//		System.out.println(list2);
//		System.out.println(list3);

//		List<Integer> list2 = list.stream().peek(num -> System.out.println(num)).collect(Collectors.toList());
//		List<Integer> list2 = list.stream().filter(num -> num > 2).collect(Collectors.toList());
//		List<Integer> list2 = list.stream().dropWhile(num -> num > 2).collect(Collectors.toList());

//		--------------------------------------------------------------------------------------------------------
//		List<Integer> list2 = list.stream().dropWhile(num -> num > 2).collect(Collectors.toList());
//		List<Integer> afterDelete = list;
//		Iterator<Integer> iterator = afterDelete.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next() < 3) {
//				iterator.remove();
//			}
//		}
//		System.out.println(afterDelete);
//		--------------------------------------------------------------------------------------------------------

		List<Integer> list2 = list.stream().sorted().dropWhile(num -> num <= 3).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list2);

		List<Integer> list3 = list.stream().filter(num -> num > 3).sorted().collect(Collectors.toList());
		System.out.println(list3);

//		System.out.println(list);
//		System.out.println(list2);
	}
}