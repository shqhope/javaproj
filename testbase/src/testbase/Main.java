package testbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Documented;

import sq.thread.*;

public class Main {

	static boolean bIsDealing(File file) {
		FileFilter ff = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory() || pathname.getName().endsWith(".dealling");
			}
		};
		return ff.accept(file);
	}
	
	static void TestFile() {
	//	String strFilename = "/home/sq/workspace_ee/世界各国IP段.txt";
	//	String strFilename = "/home/sdzw/eclipse-workspace/世界各国IP段.txt";
		String strFilename = "/home/sdzw/eclipse-workspace/aa.dealling";
		File file = new File(strFilename);
		if (bIsDealing(file))
		{
			System.out.println("file is dealing filename:" + file.getName());
		}
		else
		{
			System.out.println("file " + file.getName() + " is not dealing");
		}
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader(file));
			String strLine = null;
			int i = 0;
			while ((strLine = read.readLine()) != null) {
				System.out.println(strLine);
				i ++;
				if (i > 10)
					break;
			}
		} catch (IOException e) {
			System.out.println("open file error " + strFilename);
		}
	}
	
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
		TestThread2 thread2 = new TestThread2();
		Thread t2 = new Thread(thread2, "t2");
		Thread t1 = new Thread(thread2, "t1");
		t2.start();
		t1.start();
	}
	
	public static void main(String []args) {
		TestThread1();
		//TestFile();
		//TestThread2();
	}
	

}
