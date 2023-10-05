package com.sanju;

public class ReverseWithHash2 {
	public static void main(String[] args) {
		String str = "An apple is a fruit";
		System.out.println(str);
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		for (int i = 0; i < builder.length(); i++) {
			while (builder.charAt(i) == ' ') {
				builder.replace(i, i + 1, "#");
			}
		}
		System.out.println(builder.toString());
	}
}
