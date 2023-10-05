package com.sanju;

interface I5 {
	static int m1(int x, int y) {
		return (x + y);
	}
}

public class StaticMethod implements I5 {

//	@Override
	public static int m1(int x, int y) {
		return 10;
	}

	public static void main(String[] args) {
		System.out.println(I5.m1(2, 4));
		System.out.println(m1(2, 4));
	}

}
