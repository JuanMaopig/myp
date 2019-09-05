package my.myProject.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class IOsequenceInputStreamCutMp3 {
	public static void main(String[] args) throws Exception {
		cutFile();
		merge();
	}
	
	private static void cutFile() throws IOException {		
		//目标文件
		File file =new File("d://1.mp3");
		//目标目录
		File dirFile = new File("d://music");
		//打开输入流
		FileInputStream fis=new FileInputStream(file);
		//确认大小
		int len=0;
		//把切割的大小设为1M
		byte []buf=new byte[1024*1024];
		
		//读取数据
		for(int i=0;(len=fis.read(buf))!=-1;i++) {//使用循环来创造每一个分裂开的
			//父目录加上文件名来产生更多的mp3文件
			FileOutputStream fos=new FileOutputStream(new File(dirFile,"part"+i+".mp3"));
			fos.write(buf,0,len);
			//关闭资源
			fos.close();
		}
		fis.close();
	}

	private static void merge() throws IOException {
		//找到目录
		File dirFile=new File("d://music");
		//使用vector
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		
		//遍历所有以。mp3结尾的子文件
		File[] files=dirFile.listFiles();
		
		for(File file:files) {
			if(file.getName().endsWith(".mp3")) {
				v.add(new FileInputStream(file));
			}
			
		}
		
		//Enumeration遍历
		Enumeration<FileInputStream> e=v.elements();
		
		//序列合并输入流
		SequenceInputStream sis=new SequenceInputStream(e);
		
		//读取数据
		int len=0;
		
		byte []buf=new byte[1024];
		
		//以一个新的名字输出
		FileOutputStream fos=new FileOutputStream("d://hah.mp3");
		while((len=sis.read())!=-1) {
			fos.write(buf,0,len);
		}
		
		//关闭资源
		fos.close();
		
		sis.close();
		
	}

	
}
