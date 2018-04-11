package sq.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestFiles {
	static String s_strFilename = "/home/sdzw/eclipse-workspace/世界各国IP段.txt";
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
	
	public static void TestFile1() {
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
	
	public static void TestFile2() throws IOException {
		File file = new File(s_strFilename);
		InputStream in = new FileInputStream(file);
		Reader reader = new InputStreamReader(in);
		int ch;
		while ((ch = reader.read()) != -1)
		{
			System.out.print((char)ch);
		}
		
	}
}
