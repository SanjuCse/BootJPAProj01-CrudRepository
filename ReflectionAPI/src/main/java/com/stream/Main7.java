package com.stream;

//@FunctionalInterface
abstract class AC3 {
	public abstract void m1();
}

public class Main7 {
	static class InnerClass {

		static int x = 10;

		static public void m1() {
			System.out.println("m1 method in inner class");
		}
	}

	public void m1() {
		class InnerClass {

			int x = 10;

			public void m1() {
				System.out.println("m1 method in inner class");
			}
		}

	}

	public static void main(String[] args) {
		class InnerClass2 {
			int x = 10;

			public void m1() {
				System.out.println("m1 method in inner class");
			}
		}

		AC3 ac3 = new AC3() {
			int x = 10;

			@Override
			public void m1() {
				System.out.println("x = " + x);
				System.out.println(this);
			}

		};

		InnerClass class1 = new InnerClass();
		class1.m1();

		System.out.println();
	}
}
