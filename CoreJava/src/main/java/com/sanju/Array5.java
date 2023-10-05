package com.sanju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array5 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6 };
		int[] arr2 = { 7, 8, 9 };

		int[] arr3 = new int[arr.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr3[arr.length + i] = arr2[i];
		}

		System.out.println(Arrays.toString(arr3));

//		List<Integer> list = new ArrayList<>();
//		for (int i : arr) {
//			list.add(i);
//		}
//		for (int i : arr2) {
//			list.add(i);
//		}
//		System.out.println(list);

//		List<int[]> arrList = Arrays.asList(arr);
//		List<int[]> arr2List = Arrays.asList(arr2);
//		arrList.addAll(arr2List);
//		System.out.println(arrList);
	}
}
