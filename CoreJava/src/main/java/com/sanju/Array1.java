package com.sanju;

public class Array1 {

	public static void main(String[] args) {
//		int num[] = { 1, 2, 3, 4, 5 };
//		Integer num[] = new Integer[5];
		Integer num[] = { 1, 2, 3, 4, 5 };
		for (int i : num) {
			System.out.println(i);
		}
		System.out.println("-------------------------");

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-------------------------");
		int i = 0;
//		while (i < num.length) {
//			System.out.println(num[i]);
//			i++;
//		}

		do {
			System.out.println(num[i]);
			i++;
		} while (i < num.length);

//		System.out.println(Arrays.toString(num));
	}
}
