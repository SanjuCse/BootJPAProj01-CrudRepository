package com.sanju;

interface I3 {
	default void m1() {
		System.out.println("m1 method in I3 interface");
	};
}

interface I4 {
	default void m1() {
		System.out.println("m1 method in I4 interface");
	};
}

public class DefaultMethod3 implements I3, I4 {

	public static void main(String[] args) {
		DefaultMethod3 method3 = new DefaultMethod3();
		method3.m1();
	}

	@Override
	public void m1() {
		I4.super.m1();
//		System.out.println("Overrridden m1 method");
	}
}
