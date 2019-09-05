package my.myProject.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOcharflowReaderDemo {

	public static void main(String[] args) throws IOException {
		String path = "d:\\c.txt";
		readFileByReader(path);
	}

	private static void readFileByReader(String path) throws IOException {

		Reader reader = new FileReader(path);
		int len = 0;
		while ((len = reader.read()) != -1) {
			System.out.print((char) len);
		}

		reader.close();

	}
	//总结：字符流就是：字节流 + 编码表
}
