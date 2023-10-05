package com.thread;

public class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("run method of MyThread class");
	}

	@Override
	public synchronized void start() {
		System.out.println("start method of MyThread class");
		super.start();
	}
}

class Main3 {
	public static void main(String[] args) {
		MyThread3 abc = new MyThread3();
		abc.start();
		System.out.println("main method in Main class");
	}

}
