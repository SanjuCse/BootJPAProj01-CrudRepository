package com.sanju;

import java.util.Arrays;

public class Array3 {

	private static void sum() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		System.out.println(sum);
	}

	private static void reverse() {
		int arr[] = { 10, 20, 30, 40, 50 };
		int arr2[] = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[index] = arr[i];
			index++;
		}
		System.out.println(Arrays.toString(arr2));
	}

	private static void min() {
//		int arr[] = { 10, 20, 30, 40, 50 };
//		int arr[] = { 40, 20, 10, 30, 50 };
		int arr[] = { 40, 20, 10, 30, 50 };

		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i : arr) {
			if (min > arr[index]) {
				min = arr[index];
			}
			index++;
		}
		System.out.println(min);
	}

	private static void max() {
		int arr[] = { 40, 20, 50, 10, 30, 60 };
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i : arr) {
			if (max < arr[index]) {
				max = arr[index];
			}
			index++;
		}
		System.out.println(max);
	}

	private static void secondMin() {
		int arr[] = { 50, 20, 30, 10, 40 };
		int arr2[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			arr2[index] = arr[i];
			index++;
		}
		System.out.println(arr2[1]);
	}

	private static void secondMax() {
		int arr[] = { 50, 20, 30, 10, 40 };
		int arr2[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			arr2[index] = arr[i];
			index++;
		}
		System.out.println(arr2[arr.length - 2]);
	}

	public static void main(String[] args) {
		secondMin();
		secondMax();
	}
}
