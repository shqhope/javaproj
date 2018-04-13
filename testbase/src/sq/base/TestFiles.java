package sq.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestFiles {
	static String s_strFilename = "/home/sdzw/eclipse-workspace/世界各国IP段.txt";
	static String s_strFilepath = "/home/sdzw/eclipse-workspace";
	
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
	
	public static void TestFile9() throws IOException {
		File file = new File(s_strFilepath);
		System.out.println(file.getCanonicalPath());
		File [] filearr = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".dealling");
			}
		});
		File [] filearr2 = file.listFiles();
		for (File filetmp : filearr2)
		{
			System.out.println(filetmp.getName());
		}
		
		System.out.println("filter:" + filearr.length + " without filter:" + filearr2.length);
	}
	
	public static void TestFile0() {
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
	}
	
	public static void TestFile1() throws IOException {
		File file = new File(s_strFilename);
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
			read.close();
		} catch (IOException e) {
			System.out.println("open file error " + s_strFilename);
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
		
		
		reader.close();
	}
	
	public static void TestFile3() throws IOException {
		File file = new File(s_strFilename);
		Reader reader = new FileReader(file);
		int ich ; 
		while ((ich = reader.read()) != -1)
		{
			System.out.print((char)ich);
		}
		reader.close();
	}
	
	
	/**
	 * TestString
	 */
	public static void TestString0() {
		
	}
}
