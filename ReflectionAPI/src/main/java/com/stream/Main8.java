package com.stream;

//@FunctionalInterface
abstract class AC4 {
	public abstract void m1();
}

public class Main8 {

	public static void main(String[] args) {

		AC4 ac3 = new AC4() {
			int x = 10;

			@Override
			public void m1() {
				System.out.println("x = " + x);
				System.out.println(this);
			}

		};
		ac3.m1();
	}
}
