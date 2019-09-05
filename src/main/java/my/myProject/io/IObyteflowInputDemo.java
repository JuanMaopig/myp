package my.myProject.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IObyteflowInputDemo {

	public static void main(String[] args) throws IOException {
		String path="d://a.txt";

		//输入流读取方式1
//		showCont1(path);
		
		//输入流读取方式2,使用缓冲区
//		showCont2(path);
		
		//输入流读取方式3，read(a,b,c)
//		showCont3(path);
		
		//skip方法
		skip(path);
		
	}

	private static void showCont1(String path) throws IOException {
		//打开输入流
		FileInputStream fis=new FileInputStream(path);
		//读取文件的数据
		int len=0;
		while((len=fis.read())!=-1) {
			System.out.print((char)len);
		}
		//关闭资源
		fis.close();
		
	}	

	private static void showCont2(String path) throws IOException {
		//打开输入流
		FileInputStream fis = new FileInputStream(path);
		//使用缓冲区
		byte[] buf=new byte[1024];//数据会存到buf中，不再是len里面
		//读取资源
		int len=0;
		while((len=fis.read(buf))!=-1) {
//			 System.out.println(len);//读到了几个字节
			 System.out.println(new String(buf,0,len));//new String()字节数组构建字符串,按空间大小去构建
		}
		//关闭资源
		fis.close();
	}

	private static void showCont3(String path) throws IOException {
		//打开输入流
		FileInputStream fis = new FileInputStream(path);
		//使用缓存区
		byte[] buf=new byte[1024];
		//读取资源
		int start=1;
		
		int end=10;//规定读多少
		int len=fis.read(buf, start, end);
		
		for(int i=0;i<start+end;i++) {
			System.out.print((char)buf[i]);
		}
		//关闭资源
		fis.close();
		
	}

	private static void skip(String path) throws IOException {
		//打开输入流
		FileInputStream fis = new FileInputStream(path);
		//使用缓冲区
		byte[] buf=new byte[1024];//数据会存到buf中，不再是len里面
		fis.skip(8);
		//读取资源
		int len=0;
		while((len=fis.read(buf))!=-1) {
//			 System.out.println(len);//读到了几个字节
			 System.out.println(new String(buf,0,len));//new String()字节数组构建字符串,按空间大小去构建
		}
		//关闭资源
		fis.close();		
	}


	

}
