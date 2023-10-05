package com.sanju;

public class Test {
	int x;
//	String name = "sanju";
//	String name2 = "sanju";
//	StringBuffer sb = new StringBuffer("sanju");
//	StringBuffer sb2 = new StringBuffer("sanju");
	StringBuilder sb = new StringBuilder("sanju");
	StringBuilder sb2 = new StringBuilder("sanju");

//	@Override
//	public boolean equals(Object obj) {
//		Test obj2 = (Test) obj;
//		if (this.x == obj2.x) {
//			return true;
//		}
//		return false;
//	}

	public Test(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		Test test = new Test(10);
//		Test test2 = new Test(10);
//		System.out.println(test + " " + test2);
//		if (test.equals(test2)) {
//			System.out.println("Test and Test2 Content same");
//		} else {
//			System.out.println("Unable to Match");
//		}

//		if (test.name.equals(test.name2)) {
//			System.out.println("true");
//
//		} else {
//			System.out.println("false");
//		}

		System.out.println(System.identityHashCode(test.sb));
		System.out.println(System.identityHashCode(test.sb2));
		if (test.sb.equals(test.sb2)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}
}
