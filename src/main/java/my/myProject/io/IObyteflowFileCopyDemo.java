package my.myProject.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IObyteflowFileCopyDemo {

	public static void main(String[] args) throws IOException {
		
		String src="d://a.txt";
		String dest="d://b.txt";
		
		copyFile(src,dest);//字节流在拷贝音频和视频文件的时候效率很低
	}

	private static void copyFile(String src, String dest) throws IOException {
		// 打开输入流，输出流
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);

		// 读取和写入信息
		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		// 关闭流
		fis.close();
		fos.close();

	}

}
