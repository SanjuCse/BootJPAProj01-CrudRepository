package com.stream2;

import java.util.List;
import java.util.stream.Collectors;

public class _2AvgCalcStream {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 6, 1, 3, 4, 2, 5);
		int num1 = 0;
		double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
	}
}
