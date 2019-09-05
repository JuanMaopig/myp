package my.myProject.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IObyteflowOutputDemo {

	public static void main(String[] args) throws IOException {
		String path = "d:\\b.txt";
		
		//输出流写出方式1
		writeTxtFile1(path);
		
		//输出流写出方式2，write(byte[] b),就是使用缓冲.提高效率.
		writeTxtFile2(path);
	}

	
	private static void writeTxtFile2(String path) throws IOException {
		//打开文件输出流
		FileOutputStream fos=new FileOutputStream(path,true);
		
		//通过文件流写数据
		byte []buf ="bu".getBytes();
		
		fos.write(buf);
		
		//使用完流之后关闭流
		fos.close();
	}

	
	private static void writeTxtFile1(String path) throws IOException {
		//打开文件输出流
		FileOutputStream fos=new FileOutputStream(path);	
		
		//通过文件流向写数据
		fos.write('h');
		fos.write('e');
		fos.write('l');
		fos.write('l');
		fos.write('o');
		
		//关闭资源
		fos.close();
	}

}
