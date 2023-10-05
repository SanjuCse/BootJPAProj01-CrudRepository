package com.stream;

@FunctionalInterface
interface Fun7 {
	int y = 10;

	public abstract void m1();
}

public class Main11 {

	public static void main(String[] args) {
		Fun7 fun7 = () -> {
//			int y = 12;
//			System.out.println(y);
//			y = 20;
//			System.out.println(y);
			System.out.println(Fun7.y);
		};
		fun7.m1();
	}
}
