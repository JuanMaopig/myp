package my.myProject.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOcharflowBuffer {

	public static void main(String[] args) throws IOException {
		// 关联源文件
		File srcFile = new File("d:\\a.txt");
		// 关联目标文件
		File destFile = new File("d:\\b.txt");
		// 实现拷贝
		copyFile(srcFile, destFile);

	}
	
	private static void copyFile(File srcFile, File destFile)
			throws IOException {
		// 创建字符输入流
		FileReader fr = new FileReader(srcFile);
		// 创建字符输出流
		FileWriter fw = new FileWriter(destFile);

		// 字符输入流的缓冲流
		BufferedReader br = new BufferedReader(fr);
		// 字符输出流的缓冲流
		BufferedWriter bw = new BufferedWriter(fw);

		String line = null;
		// 一次读取一行
		while ((line = br.readLine()) != null) {
			// 一次写出一行.
			bw.write(line);
			// 刷新缓冲
			bw.flush();
			// 进行换行,由于readLine方法默认没有换行.需要手动换行
			bw.newLine();
		}
		// 关闭流
		br.close();
		bw.close();
	}


}
