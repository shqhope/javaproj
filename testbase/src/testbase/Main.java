package testbase;

import java.io.File;
import java.io.FileFilter;

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
	
	public boolean TestInterFace(File file) {
		FileFilter ff = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory() || pathname.getName().endsWith(".dealling");
			}
		};
		return ff.accept(file);		
	}
}
