package com.thread;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			run(1);
			System.out.println("run method of Mythread Class");
		}
	}

	public void run(int a) {
		for (int i = 0; i < 1; i++) {
			System.out.println("run method of Mythread Class - int");
		}
	}
}

class Main {
	public static void main(String[] args) {
		MyThread abc = new MyThread();
//		abc.start();
		abc.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main method of Main Class");
		}

	}

}
