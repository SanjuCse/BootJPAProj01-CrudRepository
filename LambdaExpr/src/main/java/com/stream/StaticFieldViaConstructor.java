package com.stream;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StaticFieldViaConstructor {
	private static int x;

	public StaticFieldViaConstructor(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		System.out.println(new StaticFieldViaConstructor().getX());
	}

	public static int getX() {
		return x;
	}

//	public static void setX(int x) {
//		new StreamTest03().x = x;
//	}
}
