package com.sanju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest4 {
	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> predicate = num -> num > 10;
		Predicate<Integer> predicate2 = num -> num % 2 == 0;
		String arrRes = predicateCalc(predicate.negate(), x);
		String arrRes2 = predicateCalc(predicate2, x);

		String arrRes3 = predicateCalc(predicate.and(predicate2).negate(), x);

		System.out.println(arrRes3);

//		Object[] arrRes = predicateCalc(predicate, x);
//		Object[] arrRes2 = predicateCalc(predicate2, x);

//		Integer[] integers = new Integer[arrRes.length];
//		System.arraycopy(arrRes, 0, integers, 0, arrRes.length);
//		System.out.println(Arrays.toString(arrRes));
//		System.out.println(Arrays.toString(integers));

	}

	private static String predicateCalc(Predicate<Integer> predicate, int[] x) {
		List<Integer> nums = new ArrayList<>();
		for (int i : x) {
			if (predicate.test(i)) {
				nums.add(i);
			}
		}
		return Arrays.toString(nums.toArray());
	}

//	private static Object[] predicateCalc(Predicate<Integer> predicate, int[] x) {
//		List<Integer> nums = new ArrayList<>();
//		for (int i : x) {
//			if (predicate.test(i)) {
//				nums.add(i);
//			}
//		}
//		return nums.toArray();
//	}

}
