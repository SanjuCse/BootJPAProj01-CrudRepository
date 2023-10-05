package com.sanju;

public class DoubleColon {

	public static void main(String[] args) {
		DColon dColon = new DColon();
		DColonIf if1 = x -> System.out.println("x is " + x);

		DColonIf if2 = dColon::m2;
		if2.m1(12);
	}
}
