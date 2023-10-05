package com.stream;

@FunctionalInterface
interface Fun1 {
	String m1();
}

@FunctionalInterface
interface Fun2 {
	int m1(int a, int b);
}

@FunctionalInterface
interface Fun3 {
	String m1(String str);
}

public class Main {
	public static void main(String[] args) {
		Fun1 fun1 = () -> {
			return "Functional - 1";
		};
		Fun2 fun2 = (a, b) -> {
			System.out.println("int m1 method");
			return a + b;
		};

		Fun3 fun3 = str -> "Fun3 string m1 method " + str;

//		Fun1 fun1 = new Fun1() {
//			@Override
//			public String m1() {
//				return "Fun 1";
//			}
//		};
		String m1 = fun1.m1();
		int m2 = fun2.m1(2, 3);
//		System.out.println(m1);
//		System.out.println(m2);
		System.out.println(fun3.m1("qwerty"));
	}

}
