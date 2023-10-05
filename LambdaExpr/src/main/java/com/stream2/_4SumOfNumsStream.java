package com.stream2;

import java.util.List;

public class _4SumOfNumsStream {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 6, 1, 3, 4, 2, 5);
		int sum = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum);

		int sumOfEven = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::valueOf).sum();
		System.out.println(sumOfEven);

		int sumOfOdd = list.stream().filter(num -> num % 2 != 0).mapToInt(Integer::valueOf).sum();
		System.out.println(sumOfOdd);
	}
}
