package com.stream;

class AC5 {
	public void m1() {
	}
}

public class Main10 {

	public static void main(String[] args) {
		AC5 ac5 = new AC5() {
			@Override
			public void m1() {
				System.out.println("m1 method");
			}
		};
		ac5.m1();
	}
}
