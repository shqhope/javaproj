package testbase;

import sq.thread.TestThread;

public class Main {
	public static void main(String []args) {
		System.out.println("Hello world");
		TestThread []arrthread = new TestThread[10];
		for (int i = 0; i < 10; ++i) {
			arrthread[i] = new TestThread(i);
			arrthread[i].start();
		}
	}
}
