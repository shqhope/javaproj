package testbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;

import sq.thread.TestThread;

public class Main {
	void TestThread() {
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
	
	static void TestFile() {
		String strFilename = "/home/sq/workspace_ee/世界各国IP段.txt";
		File file = new File(strFilename);
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
	
	public static void main(String []args) {
		TestFile();
	}
	

}
