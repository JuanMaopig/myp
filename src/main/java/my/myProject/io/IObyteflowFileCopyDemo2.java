package my.myProject.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IObyteflowFileCopyDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String src="d://a.txt";
		String dest="d://b.txt";
		
		copyFile2(src,dest);
	}

	private static void copyFile2(String src, String dest) throws IOException {
		// 打开输入流，输出流
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);

		// 读取和写入信息
		int len = 0;

		// 使用字节数组，当做缓冲区
		byte[] byt = new byte[1024];
		while ((len = fis.read(byt)) != -1) {
//			fos.write(byt);//使用FileOutputStream 的write(byte[] b, int off, int len)b 是容器，off是从数组的什么位置开始，len是获取的个数，容器用了多少就写出多少。
			fos.write(byt,0,len);
		}

		// 关闭流
		fis.close();
		fos.close();
	}

}
