package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException{
		
//		System.out.println((Math.random()+1));
		
		writeFileTest();
		
		readFileTest();
		
	}
	
	private static void writeFileTest() throws IOException {
		// 创建文件对象
		File file=new File("d:\\a.txt");
		// 创建文件输出流
		FileOutputStream fos=new FileOutputStream(file);	
		fos.write('h');
		fos.write('e');
		fos.write('l');
		fos.write('l');
		fos.write('o');
		
		fos.close();
	}

	private static void readFileTest() throws IOException {
		// 创建文件对象
		File file=new File("d:\\a.txt");
		// 创建文件输入流
		FileInputStream fis=new FileInputStream(file);
		
		// 有对多长，就读多少字节。
		for(int i=0;i<file.length();i++) {
			System.out.print((char)fis.read());
		}
		
		fis.close();
	}


}
