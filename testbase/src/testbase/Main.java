package testbase;

import java.io.IOException;

import sq.base.TestFiles;
import sq.thread.*;

public class Main {


	/**
	 * 多线程，继承thread类
	 */
	static void TestThread1() {
		System.out.println("Hello world");
		TestThread1 []arrthread = new TestThread1[10];
		for (int i = 0; i < 10; ++i) {
			String strName = "thread " + i;
			arrthread[i] = new TestThread1(i, strName);
			arrthread[i].start();
		}
		
	}
	
	/**
	 * 继承接口 runnable 适合于多个相同线程处理同一资源的情况
	 */
	static void TestThread2() {
		TestRunnableThread2 thread2 = new TestRunnableThread2();
		Thread t2 = new Thread(thread2, "t2");
		Thread t1 = new Thread(thread2, "t1");
		t2.start();
		t1.start();
	}
	
	public static void main(String []args) throws IOException {
		//TestFiles.TestFile1();
		//TestFiles.TestFile2();
		TestFiles.TestFile9();
		//TestThread1();
		//TestThread2();
	}
	

}
