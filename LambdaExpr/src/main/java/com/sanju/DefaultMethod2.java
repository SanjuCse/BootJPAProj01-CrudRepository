package com.sanju;

interface I2 {

	default int hashCode() {
		System.out.println("Error");
		return 10;
	};
}

public class DefaultMethod2 implements I2 {
	public static void main(String[] args) {
		DefaultMethod2 method2 = new DefaultMethod2();
		method2.hashCode();
	}
}
