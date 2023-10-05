package com.sanju;

import java.util.HashSet;
import java.util.Set;

public class StringTest {
	public static void main(String[] args) {
		String name = "sanju sahu";
		String subStr = name;
		char findChar = 'a';
		System.out.println(subStr);

		Set<Integer> index = new HashSet<>();
		for (int i = 0; i < subStr.length(); i++) {
			int indexOfChar = subStr.indexOf(findChar) + 1;
			index.add(indexOfChar);
			subStr = name.substring(indexOfChar);
		}

		System.out.println("Index Positions of Character \'" + findChar + "\' is " + index);
		System.out.println("Character \'" + findChar + "\' Repeats in " + index.size() + " times");
	}
}
