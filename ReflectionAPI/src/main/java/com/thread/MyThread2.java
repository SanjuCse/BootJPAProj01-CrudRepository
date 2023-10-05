package com.thread;

public class MyThread2 extends Thread {
	@Override
	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("start method of Mythread Class");
//			run();
//		}
		System.out.println(Thread.currentThread().getName());
	}
}

class Main2 {
	public static void main(String[] args) {
		MyThread2 abc = new MyThread2();
		abc.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("main method of Main Class");
//		}
		System.out.println(Thread.currentThread().getName());

	}

}
