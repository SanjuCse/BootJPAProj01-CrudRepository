package com.sanju;

public class ReverseWithHash {
	public static void main(String[] args) {
		String str = "An apple is a fruit";
//		builder.reverse();
		System.out.println(str);

		String s[] = str.split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		String str2 = ans.substring(0, ans.length() - 1);
		System.out.println(str2);

		StringBuilder builder = new StringBuilder(str2);
		for (int i = 0; i < builder.length(); i++) {
			while (builder.charAt(i) == ' ') {
				builder.replace(i, i + 1, "#");
			}
		}

//		builder.append('#');
		System.out.println(builder.toString());
	}
}
