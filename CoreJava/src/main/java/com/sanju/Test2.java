package com.sanju;

public class Test2 {
	StringBuilder sb = new StringBuilder("sanju");
	StringBuilder sb2 = new StringBuilder("sanju");

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		String sbStr = test2.sb.toString();
		String sbStr2 = test2.sb2.toString();
		System.out.println(System.identityHashCode(sbStr));
		System.out.println(System.identityHashCode(sbStr2));
		if (sbStr.equals(sbStr2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
