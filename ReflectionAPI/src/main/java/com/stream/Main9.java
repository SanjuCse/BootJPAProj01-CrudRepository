package com.stream;

@FunctionalInterface
interface Fun6 {
	public abstract void m1();
}

public class Main9 {
	private void m1() {
		Fun6 fun6 = () -> {
			int x = 10;
			System.out.println("x = " + x);
			System.out.println(this);
		};
		fun6.m1();
	}

	public static void main(String[] args) {
		new Main9().m1();
	}
}
