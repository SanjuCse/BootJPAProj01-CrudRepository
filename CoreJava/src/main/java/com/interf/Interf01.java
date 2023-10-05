package com.interf;

public interface Interf01 {
	default void m1() {
		System.out.println("Hello from Interf01");
	}

	void m2();
}

class Main implements Interf01 {
	@Override
	public void m1() {
		Interf01.super.m1();
		System.out.println("Hello from Main");
	}

	@Override
	public void m2() {
		System.out.println("Hello from m2 method");
	}

	public static void main(String[] args) {
		Interf01 interf = new Main();
		Main main = new Main();
		interf.m2();
	}
}
