package com.sanju;

interface I1 {
	default void m1() {
		System.out.println("default m1 method");
	}
}

public class DefaultMethod implements I1 {
	public static void main(String[] args) {
		DefaultMethod method = new DefaultMethod();
		method.m1();
	}
}
