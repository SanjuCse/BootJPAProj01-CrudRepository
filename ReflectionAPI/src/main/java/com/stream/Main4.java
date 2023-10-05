package com.stream;

public class Main4 {

	public static void main(String[] args) {
//		Thread thread = new Thread(() -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("run method Runnable Implementetion");
//			}
//		});

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("run method Runnable Implementetion");
				}
			}
		});
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main method");
		}
	}
}
