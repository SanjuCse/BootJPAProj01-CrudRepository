package com.stream;

//@FunctionalInterface
interface Fun4 {
	void m1();
}

//@FunctionalInterface
interface Fun5 extends Fun4 {
//	void m2();
}

public class Main2 {

	public static void main(String[] args) {
		Fun5 fun5 = () -> System.out.println("fun 5");
		fun5.m1();
		System.out.println();
	}
}
