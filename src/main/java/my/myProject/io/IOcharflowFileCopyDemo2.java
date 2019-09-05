package my.myProject.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class IOcharflowFileCopyDemo2 {

	public static void main(String[] args) throws Exception {
		String path1 = "d:/c.txt";
		String path2 = "d:/d.txt";

		copyFile(path1, path2);
	}

	public static void copyFile(String path1, String path2) throws Exception {
		Reader reader = new FileReader(path1);
		Writer writer = new FileWriter(path2);

		int ch = -1;
		char [] arr=new char[1024];
		while ((ch = reader.read(arr)) != -1) {
			writer.write(arr,0,ch);
		}

		reader.close();
		writer.close();
	}

}
