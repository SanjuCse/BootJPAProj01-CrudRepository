package com.stream;

abstract class AC {
	public abstract void m1();

	public abstract void m2();
}

public class Main5 {
	public static void main(String[] args) {
		AC ac = new AC() {

			@Override
			public void m2() {
				System.out.println("m2 method impl");
			}

			@Override
			public void m1() {
				System.out.println("m1 method impl");

			}
		};
		ac.m1();
		ac.m2();
	}
}
