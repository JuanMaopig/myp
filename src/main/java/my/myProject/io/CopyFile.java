package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File file=new File("d://1.jpg");
		String destPath="d:/new1.jpg";
		copyFile(file,destPath);
	}

	private static void copyFile(File file,String destPath) throws IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {			
			//打开输入流
			fis=new FileInputStream(file);
			fos=new FileOutputStream(destPath);
			
			//字符数组
			byte []buf= new byte[1024];
			
			//读取数据
			int len=0;
			while((len=fis.read(buf))!=-1) {
				fos.write(buf,0,len);
			}
			
		}catch(IOException e) {
			System.out.println("拷贝图片出错...");
			throw new RuntimeException(e);
		}finally {	
			try {
				if(fos!=null) {					
					fos.close();
					System.out.println("关闭输出流对象成功...");
				}
			}catch(IOException e) {
				System.out.println("关闭输出流对象失败...");
				throw new RuntimeException(e);
			}finally {
				try {					
					if(fis!=null) {					
						fis.close();
						System.out.println("关闭输入流对象成功...");
					}
				}catch(IOException e) {
					System.out.println("关闭输入流对象失败...");
					throw new RuntimeException(e);
				}
			}
		}
		
	}


}
