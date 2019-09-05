package my.myProject.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IObyteflowFileInputOutputApplyDemo {
	
	public static void main(String[] args) throws IOException {
		//通过字节输出流向文件中写入一些信息，并使用字节输入流把文件中的信息显示到控制台上
		String path="d://b.txt";
		
		String content="woaichengdu";
		
		writeFile(path,content);
		readFile(path);
	}


	private static void writeFile(String path, String content) throws IOException {
		//打开输出流
		FileOutputStream fos=new FileOutputStream(path);
		
		byte[] buf=content.getBytes();
		
		fos.write(buf);
		
		fos.close();
		
	}

	private static void readFile(String path) throws IOException {
		//打开输入流
		FileInputStream fis=new FileInputStream(path);
		
		byte[] buf=new byte[1024];
		
		int len=0;
		
		while((len=fis.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
		}
		
		fis.close();
		
	}
	



}
