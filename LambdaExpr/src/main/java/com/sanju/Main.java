package com.sanju;

public class Main {
	public static void main(String[] args) {
		int y = 10;
		Fun1 fun1 = () -> {
			int x = 10;
			System.out.println(x);
			x = 12;
			System.out.println(y);
//			y = 12;
			System.out.println(x);
		};
		fun1.m1();
	}
}
