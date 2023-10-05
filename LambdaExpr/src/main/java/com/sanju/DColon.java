package com.sanju;

interface DColonIf {
	public void m1(int x);
}

public class DColon {
	public int m2(int x) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable impl - " + i);
		}

		return 10;
	}
}
