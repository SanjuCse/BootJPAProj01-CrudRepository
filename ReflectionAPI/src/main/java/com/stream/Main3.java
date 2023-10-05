package com.stream;

public class Main3 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("run method implemetion");

			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main method");
		}
	}
}
